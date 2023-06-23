package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.wildandwizard.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
