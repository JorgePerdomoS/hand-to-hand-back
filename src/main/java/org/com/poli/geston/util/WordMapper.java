package org.com.poli.geston.util;

import org.com.poli.geston.domain.StepDTO;
import org.com.poli.geston.domain.WordDTO;
import org.com.poli.geston.persistence.entity.StepEntity;
import org.com.poli.geston.persistence.entity.WordEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WordMapper {

    WordEntity wordToEntity(WordDTO dto);

    WordDTO wordToDTO(WordEntity entity);

    StepEntity stepToEntity(StepDTO dto);

    StepDTO stepToDTO(StepEntity entity);

    List<StepEntity> stepsToEntities(List<StepDTO> steps);

    List<StepDTO> stepsToDTOs(List<StepEntity> steps);
}