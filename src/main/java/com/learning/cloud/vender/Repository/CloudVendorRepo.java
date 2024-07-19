package com.learning.cloud.vender.Repository;

import com.learning.cloud.vender.entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,Integer> {
}
