package com.example.eventplannerback.persistence.person.repository;

import com.example.eventplannerback.persistence.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUserName(String userName);
}
