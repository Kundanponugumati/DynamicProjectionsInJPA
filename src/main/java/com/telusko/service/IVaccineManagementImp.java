package com.telusko.service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class IVaccineManagementImp implements IVaccineManagement{

    @Autowired
    private IVaccineRepository repository;

    @Override
    public List<ResultView> fetchByPriceLessThan(Integer price) {
        return repository.findByPriceLessThan(price);
    }
}
