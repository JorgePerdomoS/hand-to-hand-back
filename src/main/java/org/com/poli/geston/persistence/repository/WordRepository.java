package org.com.poli.geston.persistence.repository;

import org.com.poli.geston.persistence.entity.WordEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WordRepository extends MongoRepository<WordEntity, String> {
    boolean existsByWord(String word);
    Optional<WordEntity> findByWord(String word);
    List<WordEntity> findByWordContainingIgnoreCase(String query);
}
