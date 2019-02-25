package com.rci.available.units.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.rci.available.units.entity.AvailableUnitsEntity;
import com.rci.available.units.model.AvailableUnits;

@Mapper(componentModel="spring")
public interface AvailableUnitsMapper{
	@Mappings({
		@Mapping(source="availableUnitId",target="unitNumber"),
		@Mapping(source="resortCode",target="resortId")
	        })
	
	AvailableUnits map(AvailableUnitsEntity auEntity);
}
