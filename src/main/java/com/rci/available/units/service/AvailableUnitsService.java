package com.rci.available.units.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rci.available.units.model.AvailableUnits;

@Service
public interface AvailableUnitsService {

  public List<AvailableUnits> getAvailableUnits(String resortCode);
}
