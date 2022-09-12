package com.vti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vti.entity.Csv;

@Repository
public interface ICsvRepository extends JpaRepository<Csv, Integer> {
	Optional<Csv> findByName(String name);
}
