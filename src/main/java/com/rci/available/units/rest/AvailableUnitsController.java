package com.rci.available.units.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rci.available.units.model.AvailableUnits;
import com.rci.available.units.service.AvailableUnitsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="AU-API",consumes="application/json",produces="application/json")
public class AvailableUnitsController {
	
	@Autowired
	AvailableUnitsService availableUnitsService;
	
	@GetMapping("/availableUnitsById")
	@ApiOperation(consumes="application/json",produces="application/json",value="getAvailableUnits",notes="gives the available units based on the resort id")
	public ResponseEntity<List<AvailableUnits>> getAvailableUnits(@RequestParam(defaultValue="0450") String resortCode) {
		
		return new ResponseEntity<List<AvailableUnits>>(availableUnitsService.getAvailableUnits(resortCode), HttpStatus.OK);
		
	}


}
