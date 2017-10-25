package com.rkv.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rkv.springboot.model.LorryInfo;
import com.rkv.springboot.model.Metadata;
import com.rkv.springboot.model.Outcome;
import com.rkv.springboot.model.TransportResponse;
import com.rkv.springboot.service.LorryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Lorry information", description = "Lorry API generates available list of lorry details and provision to add available lorry")
@ApiResponses(value = { @ApiResponse(code = 200, message = "succesfully retrieved list"),
		@ApiResponse(code = 500, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you are trying to reach is forbidden"),
		@ApiResponse(code = 400, message = "Bad request"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
public class LorryController {

	@Autowired
	LorryService lorryService;

	@RequestMapping(value = "/addLorry", method = RequestMethod.POST, produces = "application/json")
	public TransportResponse addAvailableLorry(@RequestBody LorryInfo lorryInfo) {
		lorryService.saveLorry(lorryInfo);
		TransportResponse transResponse = new TransportResponse();

		Outcome outcome = new Outcome();
		outcome.setStatus(200);
		outcome.setType("SUCCESS");
		outcome.setMessage("successfully saved.");

		Metadata metadata = new Metadata();
		metadata.setServiceReferenceId("sjs123kd");
		metadata.setOutcome(outcome);

		transResponse.setMetadata(metadata);

		return transResponse;

	}

	@RequestMapping(value = "/listLorry", method = RequestMethod.GET, produces = "application/json")
	public TransportResponse listAvailableLorries() {

		List<LorryInfo> lorries = lorryService.findAllAvailableLorries();

		TransportResponse transResponse = new TransportResponse();
		transResponse.setLorryDetail(lorries);

		Outcome outcome = new Outcome();
		outcome.setStatus(200);
		outcome.setType("SUCCESS");
		outcome.setMessage("successfully retrieved.");

		Metadata metadata = new Metadata();
		metadata.setServiceReferenceId("sjs123kk");
		metadata.setOutcome(outcome);

		transResponse.setMetadata(metadata);
		return transResponse;
	}
}
