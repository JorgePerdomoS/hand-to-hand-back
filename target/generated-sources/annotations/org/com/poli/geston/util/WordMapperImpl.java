package org.com.poli.geston.util;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.com.poli.geston.domain.StepDTO;
import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.persistence.entity.StepEntity;
import org.com.poli.geston.persistence.entity.WordEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-16T22:41:39-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.18 (Amazon.com Inc.)"
)
@Component
public class WordMapperImpl implements WordMapper {

    @Override
    public WordEntity wordToEntity(WordDTO dto) {
        if ( dto == null ) {
            return null;
        }

        WordEntity wordEntity = new WordEntity();

        return wordEntity;
    }

    @Override
    public WordDTO wordToDTO(WordEntity entity) {
        if ( entity == null ) {
            return null;
        }

        WordDTO wordDTO = new WordDTO();

        return wordDTO;
    }

    @Override
    public StepEntity stepToEntity(StepDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StepEntity stepEntity = new StepEntity();

        return stepEntity;
    }

    @Override
    public StepDTO stepToDTO(StepEntity entity) {
        if ( entity == null ) {
            return null;
        }

        StepDTO stepDTO = new StepDTO();

        return stepDTO;
    }

    @Override
    public List<StepEntity> stepsToEntities(List<StepDTO> steps) {
        if ( steps == null ) {
            return null;
        }

        List<StepEntity> list = new ArrayList<StepEntity>( steps.size() );
        for ( StepDTO stepDTO : steps ) {
            list.add( stepToEntity( stepDTO ) );
        }

        return list;
    }

    @Override
    public List<StepDTO> stepsToDTOs(List<StepEntity> steps) {
        if ( steps == null ) {
            return null;
        }

        List<StepDTO> list = new ArrayList<StepDTO>( steps.size() );
        for ( StepEntity stepEntity : steps ) {
            list.add( stepToDTO( stepEntity ) );
        }

        return list;
    }
}
