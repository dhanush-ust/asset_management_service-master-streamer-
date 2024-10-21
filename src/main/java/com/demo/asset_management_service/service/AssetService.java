package com.demo.asset_management_service.service;

import com.demo.asset_management_service.dto.AllocationDto;
import com.demo.asset_management_service.model.Allocation;
import com.demo.asset_management_service.repository.AssetRepo;
import com.speedment.jpastreamer.application.JPAStreamer;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssetService {

    @Autowired
    private AssetRepo assetRepo;

    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Allocation> getAllAllocations(){
        return assetRepo.findAll();
    }

    public Allocation getAllocationById(Long id){
        return assetRepo.findById(id).get();
    }

    public Allocation addAllocation(AllocationDto allocation){
        Allocation res = new Allocation();
        BeanUtils.copyProperties(allocation,res);
        return assetRepo.saveAndFlush(res);
    }

    public List<Allocation> getAllocationsByStatus(String status) {
        return jpaStreamer.stream(Allocation.class)
                .filter(allocation -> allocation.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
