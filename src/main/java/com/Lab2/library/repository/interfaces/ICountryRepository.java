package com.Lab2.library.repository.interfaces;

import com.Lab2.library.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICountryRepository extends JpaRepository<Country,Long> {

    List<Country> findAll();

}

