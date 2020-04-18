package com.capg.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.lab2.models.Trainee;

public interface TraineeDaoInterface extends JpaRepository<Trainee,Integer> {

}
