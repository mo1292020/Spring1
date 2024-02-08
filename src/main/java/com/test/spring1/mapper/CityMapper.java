package com.test.spring1.mapper;

import com.test.spring1.entity.CityEntity;
import com.test.spring1.model.CityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface CityMapper {

    @Mapping(source = "name",target = "name",qualifiedByName = "addX")
    CityModel toModel(final CityEntity cityEntity);
    CityEntity toEntity(final CityModel cityModel);

    @Named("addX")
    default String addX(String name){
        return (name+"x");
    }

}
