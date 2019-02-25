package com.rci.available.units.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="AVAILABLE_UNITS",schema="ODSCSINVCDC_OWNER")
public class AvailableUnitsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="AVAILABLE_UNIT_ID")
	private Long availableUnitId;
	
	@Column(name="RESORTCODE")
	private String resortCode;
	
	@Column(name="BEDROOM_CODE")
	private String bedroomCode;
	
	@Column(name="MAX_OCCUPANCY")
	private String maxOccupency;
	
	@Column(name="KITCHEN_TYPE_ID")
	private String kitchenType;
	

}
