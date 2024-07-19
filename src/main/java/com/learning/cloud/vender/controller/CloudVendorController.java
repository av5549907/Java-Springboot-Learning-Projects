package com.learning.cloud.vender.controller;

import com.learning.cloud.vender.Service.CloudVendorService;
import com.learning.cloud.vender.entity.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cloud")
public class CloudVendorController {
    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("/start")
    public String  start(){
        return cloudVendorService.start();
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
