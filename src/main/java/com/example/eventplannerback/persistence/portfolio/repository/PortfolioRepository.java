package com.example.eventplannerback.persistence.portfolio.repository;

import com.example.eventplannerback.persistence.portfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    @Query(value = "select url from portfolio where employee_id = :id and name = 'logo'", nativeQuery = true)
    String findLogoByEmployeeId(@Param("id") Long id);

    @Query(value = "select url from portfolio where employee_id = :id and name = 'image'", nativeQuery = true)
    String findImageByEmployeeId(@Param("id") Long id);
}
