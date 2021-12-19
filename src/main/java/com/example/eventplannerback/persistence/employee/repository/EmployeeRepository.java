package com.example.eventplannerback.persistence.employee.repository;

import com.example.eventplannerback.persistence.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByUserName(String userName);
    List<Employee> findAllBySpecialist(String specialist);

    @Query(value = "select price from employee where id = :id", nativeQuery = true)
    Integer findPriceById(@Param("id") Long id);
}
