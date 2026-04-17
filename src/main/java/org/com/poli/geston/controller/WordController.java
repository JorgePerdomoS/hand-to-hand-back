package org.com.poli.geston.controller;

import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController {

    private final WordService service;

    public WordController(WordService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createWord(@RequestBody WordDTO word) {
        return ResponseEntity.ok(service.createWord(word));
    }
}
