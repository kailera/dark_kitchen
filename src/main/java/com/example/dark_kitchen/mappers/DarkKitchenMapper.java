package com.example.dark_kitchen.mappers;

import com.example.dark_kitchen.dto.DarkKitchenDTO;
import com.example.dark_kitchen.models.DarkKitchen;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DarkKitchenMapper {
    DarkKitchenMapper INSTANCE = Mappers.getMapper(DarkKitchenMapper.class);

    DarkKitchen toModel(DarkKitchenDTO darkKitchenDTO);

    DarkKitchenDTO toDTO(DarkKitchen darkKitchen);
}
