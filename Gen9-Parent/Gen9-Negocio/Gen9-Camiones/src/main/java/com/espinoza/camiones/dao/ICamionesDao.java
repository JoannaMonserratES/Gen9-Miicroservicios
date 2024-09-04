package com.espinoza.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espinoza.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long>{

}
