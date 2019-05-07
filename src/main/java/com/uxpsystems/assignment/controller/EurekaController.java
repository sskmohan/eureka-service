package com.uxpsystems.assignment.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/EntryService")
@Api(tags = "Entry Service",value="EntryService", description="Operations pertaining to Assignment Service")
@CrossOrigin
public class EurekaController{
	
    @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public String entryService()
    {
    	return "Entry Service Check";
    }
}

