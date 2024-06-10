package com.telusko.dao;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<VaccineDetails,Long> {
    List<ResultView> findByPriceLessThan(Integer price);
}
