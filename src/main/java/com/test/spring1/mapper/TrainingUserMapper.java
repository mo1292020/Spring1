package com.test.spring1.mapper;

import com.test.spring1.entity.TrainingUserEntity;
import com.test.spring1.model.TrainingUserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrainingUserMapper {

    TrainingUserModel toModel(final TrainingUserEntity trainingUserEntity);
    TrainingUserEntity toEntity(final TrainingUserModel trainingUserModel);
}
