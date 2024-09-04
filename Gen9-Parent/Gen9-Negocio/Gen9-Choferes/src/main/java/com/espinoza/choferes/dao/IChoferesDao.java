package com.espinoza.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espinoza.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long> {

    

}
