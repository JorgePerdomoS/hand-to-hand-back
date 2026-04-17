package org.com.poli.geston.service.impl;

import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.persistence.entity.WordEntity;
import org.com.poli.geston.persistence.repository.WordRepository;
import org.com.poli.geston.service.WordService;
import org.com.poli.geston.util.WordMapper;
import org.springframework.stereotype.Service;

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

        if(repository.existsByWord(newWord.getWord())){
            return "Word already exist";
        }
        WordEntity entity = mapper.wordToEntity(newWord);
        repository.save(entity);

        return "Word saved";
    }
}