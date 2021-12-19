package com.example.eventplannerback.persistence.event.repository;

import com.example.eventplannerback.persistence.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByType(String type);
}
