package org.com.poli.geston.controller;

import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.service.WordService;
import org.com.poli.geston.util.WordMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/word")
public class WordController {

    private final WordService service;
    private final WordMapper mapper;

    public WordController(WordService service, WordMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createWord(@RequestBody WordDTO word) {
        return ResponseEntity.ok(service.createWord(word));
    }

    @GetMapping("/search")
    public ResponseEntity<List<WordDTO>> searchWords(@RequestParam String query) {
        return ResponseEntity.ok(service.searchWords(query));
    }

    @GetMapping("/all")
    public ResponseEntity<List<WordDTO>> getAllWords(){
        return ResponseEntity.ok(service.getAllWords());
    }

    @GetMapping()
    public ResponseEntity<WordDTO> getWord(@RequestParam String word){
        WordDTO result = service.getWord(word);
        if (result == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateWord(@RequestParam String word, @RequestBody WordDTO updatedWord) {
        String result = service.updateWord(word, updatedWord);
        if (result.equals("Word not found")) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteWord(@RequestParam String word) {
        String result = service.deleteWord(word);
        if (result.equals("Word not found")) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }
}
