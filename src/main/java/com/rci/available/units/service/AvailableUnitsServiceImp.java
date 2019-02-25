package com.rci.available.units.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.rci.available.units.mapper.AvailableUnitsMapper;
import com.rci.available.units.model.AvailableUnits;
import com.rci.available.units.repository.AvailableUnitsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AvailableUnitsServiceImp implements AvailableUnitsService {
	
	@Autowired
	AvailableUnitsRepository availableUnitsRepository;
	
	@Autowired
	AvailableUnitsMapper availableUnitMapper;
	
	@Autowired
	Environment environment;

	@Override
	public List<AvailableUnits> getAvailableUnits(String resortCode) {
		log.info("The instance currently handled by the request"+environment.getProperty("local.server.port"));
		return availableUnitsRepository.findByResortCode(resortCode).parallelStream().map(availableUnitMapper::map).collect(Collectors.toList());
	}

}
