package com.learning.cloud.vender.ServiceImpl;

import com.learning.cloud.vender.Repository.CloudVendorRepo;
import com.learning.cloud.vender.ResponseHandler.ElementNotFoundException;
import com.learning.cloud.vender.Service.CloudVendorService;
import com.learning.cloud.vender.entity.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudServiceImp implements CloudVendorService {
    @Autowired
    CloudVendorRepo cloudVendorRepo;
    @Override
    public String start() {
        return "Welcome to our cloud vendor project";
    }

    @Override
    public String createVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Data Saved SuccessFully";
    }

    @Override
    public List<CloudVendor> getAllVendors() {
        return cloudVendorRepo.findAll();
    }

    @Override
    public String deleteVendor(int vendorId) {
        CloudVendor cloudVendor=cloudVendorRepo.findById(vendorId).orElseThrow();
        cloudVendorRepo.delete(cloudVendor);
        return "vendor with id "+vendorId+" deleted Successfully";
    }
}
