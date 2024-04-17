package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Plan;

public interface PlanRepo extends JpaRepository<Plan,Integer> {

}
