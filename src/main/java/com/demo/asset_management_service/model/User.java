package com.demo.asset_management_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private long id;
    private String name;
    private String department;
    private String designation;
    private Double Salary;
}
