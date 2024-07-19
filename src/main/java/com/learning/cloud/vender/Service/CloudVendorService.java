package com.learning.cloud.vender.Service;

import com.learning.cloud.vender.entity.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String start();
    public String createVendor(CloudVendor cloudVendor);

    public List<CloudVendor> getAllVendors();
}
