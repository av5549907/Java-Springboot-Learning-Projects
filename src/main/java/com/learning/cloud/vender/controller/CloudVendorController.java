package com.learning.cloud.vender.controller;

import com.learning.cloud.vender.Service.CloudVendorService;
import com.learning.cloud.vender.entity.CloudVendor;
import com.learning.cloud.vender.response.Responsehandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cloud")
public class CloudVendorController {
    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("/start")
    public ResponseEntity<Object> start(){
        return  Responsehandler.responseBuilder("Project is starting", HttpStatus.OK,cloudVendorService.start());
        //return cloudVendorService.start();
    }
    @PostMapping("/")
    public String createVendor(@RequestBody CloudVendor cloudVendor){
       return cloudVendorService.createVendor(cloudVendor);
    }

    @GetMapping("/")
    public List<CloudVendor> getAllVendors(){
        return cloudVendorService.getAllVendors();
    }
    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable int vendorId) {
        return cloudVendorService.deleteVendor(vendorId);
    }
}
