package org.com.poli.geston.persistence.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "word")
public class WordEntity {

    @Id
    private String id;
    private String word;
    private String description;
    private List<StepEntity> steps;
    private String videoURL;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
