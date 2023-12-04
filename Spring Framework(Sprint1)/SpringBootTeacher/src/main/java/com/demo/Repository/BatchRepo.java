package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Batches;

public interface BatchRepo extends JpaRepository<Batches, Integer>{

}
