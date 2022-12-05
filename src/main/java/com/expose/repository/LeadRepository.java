package com.expose.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expose.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
