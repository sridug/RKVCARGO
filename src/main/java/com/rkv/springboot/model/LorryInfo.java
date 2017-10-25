package com.rkv.springboot.model;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="LORRY_INFO")
public class LorryInfo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long serialNumber;

	@NotEmpty
	@Column(name="REGISTERED", nullable=false)
	private String lorryRegistered;

	@Column(name="LORRYNUMBER", nullable=false)
	private Integer lorryNumber;
	
	@NotEmpty
	@Column(name="NAMEBOARD", nullable=false)
	private String lorryNameBoard;

	@Column(name="GPSAVAILABLE", nullable=false)
	private String gpsAvailable;
	
	@Column(name="GPSNUMBER", nullable=false)
	private Integer gpsNumber;
	
	@Column(name="OWNERADDRESS", nullable=false)
	private String ownerAddress;
	
	@Column(name="OWNERNUMBER", nullable=false)
	private Integer ownerPhoneNumber;
	
	@Column(name="DRIVERNUMBER", nullable=false)
	private Integer driverPhoneNumber;
	
	@Column(name="AVAILABLEFROM", nullable=false)
	private Date lorryAvailableFrom;
	
	@Column(name="AADHAR")
	private Integer aadharCard;
	
	@Column(name="PAN")
	private String PanCard;
	
	@Column(name="PERMITNUMBER")
	private Integer permitNumber;
	
	@Column(name="PERMITDATE")
	private Date permitExpiryDate;
	
	@Column(name="INSURANCENUMBER")
	private Integer insuranceNumber;
	
	@Column(name="INSURANCEDATE")
	private Date insuranceExpiryDate;
	
	@Column(name="FROMSTATR")
	private String fromState;
	
	@Column(name="FROMDIST")
	private String fromDistrict;
	
	@Column(name="FROMCITY")
	private String fromCity;
	
	
	@Column(name="TOSTATE")
	private String toState;
	
	@Column(name="TODIST")
	private String toDistrict;
	
	@Column(name="TOCITY")
	private String toCity;
	
/*	private LocationInfo fromLocation;
	private LocationInfo toLocation;*/

}
