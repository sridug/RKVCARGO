package com.rkv.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rkv.springboot.model.LorryDetail;
import com.rkv.springboot.model.Metadata;
import com.rkv.springboot.model.Outcome;
import com.rkv.springboot.model.TransportResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Available lorry information", description = "Available lorry API generates available lorry details")
@ApiResponses(value = { @ApiResponse(code = 200, message = "succesfully retrieved list"),
		@ApiResponse(code = 500, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you are trying to reach is forbidden"),
		@ApiResponse(code = 400, message = "Bad request"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
public class AvailableLorryController {
	
	@RequestMapping(value = "/add-availablelorry", method = RequestMethod.POST, produces = "application/json")
	public TransportResponse addAvailableLorry(@RequestParam(name="lorryNumber",required=false) Integer lorryNumber,
			@RequestParam(name="lorryName",required=false) String lorryName,
			@RequestParam(name="lorryOwner",required=false) String lorryOwner,
			@RequestParam(name="ownerNumber",required=false) Integer ownerNumber) {
		
		TransportResponse transRespone = new TransportResponse();

		List<LorryDetail> lorries = new ArrayList<LorryDetail>();
		
		
		LorryDetail lorryDetail1 = new LorryDetail();
		lorryDetail1.setLorryName("ABC Lorry");
		lorryDetail1.setLorryNumber(1234);
		lorryDetail1.setLorryOwner("Owner ABC");
		lorryDetail1.setOwenerPhone(987654234);
		
		LorryDetail lorryDetail2 = new LorryDetail();
		lorryDetail2.setLorryNumber(lorryNumber);
		lorryDetail2.setLorryName(lorryName);
		lorryDetail2.setLorryOwner(lorryOwner);
		lorryDetail2.setOwenerPhone(ownerNumber);
		
		lorries.add(lorryDetail1);
		lorries.add(lorryDetail2);

		transRespone.setLorryDetail(lorries);
		
		Outcome outcome = new Outcome();
		outcome.setStatus(200);
		outcome.setType("SUCCESS");
		outcome.setMessage("successfully retrieved.");

		Metadata metadata = new Metadata();
		metadata.setServiceReferenceId("sjs123kd");
		metadata.setOutcome(outcome);
		metadata.setLimit(2);
		metadata.setOffset(0);
		metadata.setTotal(6);
		transRespone.setMetadata(metadata);

		return transRespone;
		
		
	}

	@RequestMapping(value = "/available-lorry", method = RequestMethod.GET, produces = "application/json")
	public TransportResponse getAvailableLorryDetails() {
		TransportResponse transRespone = new TransportResponse();

		List<LorryDetail> lorries = new ArrayList<LorryDetail>();

		LorryDetail lorryDetail1 = new LorryDetail();
		lorryDetail1.setLorryName("ABC Lorry");
		lorryDetail1.setLorryNumber(1234);
		lorryDetail1.setLorryOwner("Owner ABC");
		lorryDetail1.setOwenerPhone(987654234);

		LorryDetail lorryDetail2 = new LorryDetail();
		lorryDetail2.setLorryName("DBA Lorry");
		lorryDetail2.setLorryNumber(8907);
		lorryDetail2.setLorryOwner("Owner DBA");
		lorryDetail2.setOwenerPhone(7383993);

		lorries.add(lorryDetail1);
		lorries.add(lorryDetail2);

		transRespone.setLorryDetail(lorries);

		Outcome outcome = new Outcome();
		outcome.setStatus(200);
		outcome.setType("SUCCESS");
		outcome.setMessage("successfully retrieved.");

		Metadata metadata = new Metadata();
		metadata.setServiceReferenceId("sjs123kd");
		metadata.setOutcome(outcome);
		metadata.setLimit(2);
		metadata.setOffset(0);
		metadata.setTotal(6);
		transRespone.setMetadata(metadata);

		return transRespone;
	}
}
