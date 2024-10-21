package com.demo.asset_management_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Allocation {
    @Id
    private Long id;
    private String userName;
    private String userDepartment;
    private String userMobile;
    private String assetName;
    private String assetModel;
//    private User user;
//    private List<Asset> asset;
    private String status;
    private int totTicket;
    private LocalDate allocationDate;
    private LocalDate returnDate;
}
