package org.com.poli.geston.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class WordDTO {

    private String word;
    private String description;
    private List<StepDTO> steps;
    private String videoURL;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
