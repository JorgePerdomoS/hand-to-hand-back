package org.com.poli.geston.persistence.repository;

import org.com.poli.geston.persistence.entity.WordEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends MongoRepository<WordEntity, String> {
    boolean existsByWord(String word);
}
