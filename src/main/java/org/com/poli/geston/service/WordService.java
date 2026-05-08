package org.com.poli.geston.service;

import org.com.poli.geston.domain.WordDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordService {
    String createWord(WordDTO newWord);
    List<WordDTO> getAllWords();
    WordDTO getWord(String word);
    String updateWord(String word, WordDTO updatedWord);
    String deleteWord(String word);
    List<WordDTO> searchWords(String query);
}
