package com.telusko.service;

import com.telusko.bo.VaccineDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface IVaccineManagement {
    List<ResultView> fetchByPriceLessThan(Integer price);

}
