package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.entity.Movie;



public interface MovieDao  extends JpaRepository<Movie, Integer>{

}
