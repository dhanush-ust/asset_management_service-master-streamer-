package com.demo.asset_management_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Asset {
    private long id;
    private String name;
    private String model;
    private String modelNo;
    private String brand;
    private Double price;
}
