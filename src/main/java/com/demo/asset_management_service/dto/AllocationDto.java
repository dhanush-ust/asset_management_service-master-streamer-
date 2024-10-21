package com.demo.asset_management_service.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllocationDto {

    @NotNull(message = "ID is required")
    @Min(value = 1, message = "ID should be greater than 0")
    private Long id;

    @NotBlank(message = "Username is required")
    @Size(min = 3, message = "Username must be at least 3 characters")
    private String userName;

    @NotBlank(message = "User department is required")
    private String userDepartment;

    @NotBlank(message = "User mobile is required")
    @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "User mobile must be a valid number with 7 to 15 digits")
    private String userMobile;

    @NotBlank(message = "Asset name is required")
    private String assetName;

    @NotBlank(message = "Asset model is required")
    private String assetModel;

    @NotBlank(message = "Status is required")
    @Pattern(regexp = "^(ASSIGNED|RETURNED|IN_MAINTENANCE|LOST)$", message = "Status must be one of ASSIGNED, RETURNED, IN_MAINTENANCE, or LOST")
    private String status;

    @Min(value = 0, message = "Total tickets should be zero or more")
    private int totTicket;

    @NotNull(message = "Allocation date is required")
    private LocalDate allocationDate;

    private LocalDate returnDate;
}