package com.learning.cloud.vender.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int vendorId;
    String vendorName;
    String vendorAddress;
    String mobile;

}
