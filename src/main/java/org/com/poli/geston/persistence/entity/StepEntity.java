package org.com.poli.geston.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document (collection = "step")
public class StepEntity {

    @Id
    private String id;
    private Integer stepNumber;
    private String imageURL;
    private String instruction;

}
