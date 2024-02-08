package com.test.spring1.mapper;

import com.test.spring1.entity.CountryLanguageEntity;
import com.test.spring1.model.CountryLanguageModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryLanguageModel toModel(final CountryLanguageEntity countryLanguageEntity);
    CountryLanguageEntity toEntity(final CountryLanguageModel countryLanguageModel);

}
