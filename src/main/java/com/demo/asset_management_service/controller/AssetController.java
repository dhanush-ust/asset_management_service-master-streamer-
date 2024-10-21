package com.demo.asset_management_service.controller;

import com.demo.asset_management_service.dto.AllocationDto;
import com.demo.asset_management_service.model.Allocation;
import com.demo.asset_management_service.service.AssetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AssetController {
    @Autowired
    private AssetService assetService;

    @GetMapping("/allocation")
    ResponseEntity<?> getAllAllocation(){
        List<Allocation> res = assetService.getAllAllocations();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/allocation/{id}")
    ResponseEntity<?> getAllAllocation(@PathVariable Long id){
        Allocation res = assetService.getAllocationById(id);
        return ResponseEntity.ok(res);
    }
    
    @PostMapping("/allocation")
    ResponseEntity<?> addAllocation(@RequestBody @Valid AllocationDto allocation){
        Allocation res = assetService.addAllocation(allocation);
        return ResponseEntity.ok(res);
    }
    
    @GetMapping("/allocation/status/{status}")
    ResponseEntity<?> getAllocationByStatus(@PathVariable String status){
        List<Allocation> res = assetService.getAllocationsByStatus(status);
        return ResponseEntity.ok(res);
    }


}
