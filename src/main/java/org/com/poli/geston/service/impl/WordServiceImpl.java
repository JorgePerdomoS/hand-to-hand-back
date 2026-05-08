package org.com.poli.geston.service.impl;

import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.persistence.entity.WordEntity;
import org.com.poli.geston.persistence.repository.WordRepository;
import org.com.poli.geston.service.WordService;
import org.com.poli.geston.util.WordMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository repository;
    private final WordMapper mapper;

    public WordServiceImpl(WordRepository repository, WordMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String createWord(WordDTO newWord) {
        newWord.setWord(newWord.getWord().toLowerCase());
        if(repository.existsByWord(newWord.getWord())){
            return "Word already exist";
        }
        WordEntity entity = mapper.wordToEntity(newWord);
        repository.save(entity);
        return "Word saved";
    }

    @Override
    public List<WordDTO> getAllWords() {
        return repository.findAll()
                .stream()
                .map(mapper::wordToDTO)
                .toList();
    }

    @Override
    public WordDTO getWord(String word) {
        Optional<WordEntity> wordEntity = repository.findByWord(word.toLowerCase());
        return wordEntity
                .map(mapper::wordToDTO)
                .orElse(null);
    }

    @Override
    public String updateWord(String word, WordDTO updatedWord) {
        return repository.findByWord(word.toLowerCase())
                .map(entity -> {
                    updatedWord.setWord(updatedWord.getWord().toLowerCase());
                    WordEntity updated = mapper.wordToEntity(updatedWord);
                    updated.setId(entity.getId());
                    repository.save(updated);
                    return "Word updated";
                })
                .orElse("Word not found");
    }

    @Override
    public String deleteWord(String word) {
        return repository.findByWord(word.toLowerCase())
                .map(entity -> {
                    repository.delete(entity);
                    return "Word deleted";
                })
                .orElse("Word not found");
    }

    @Override
    public List<WordDTO> searchWords(String query) {
        return repository.findByWordContainingIgnoreCase(query)
                .stream()
                .map(mapper::wordToDTO)
                .toList();
    }
}