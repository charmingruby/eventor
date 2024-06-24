package com.eventor.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventor.api.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
