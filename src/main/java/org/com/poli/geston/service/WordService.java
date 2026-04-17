package org.com.poli.geston.service;

import org.com.poli.geston.domain.WordDTO;
import org.springframework.stereotype.Service;

@Service
public interface WordService {
    String createWord(WordDTO newWord);
}
