package com.elex.apexdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elex.apexdata.models.FullDataModel;

public interface FullDataRepo extends JpaRepository<FullDataModel, Integer>{

}
