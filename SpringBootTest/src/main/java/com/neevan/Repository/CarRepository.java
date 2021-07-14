package com.neevan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neevan.Entity.MyTable;

public interface CarRepository extends JpaRepository<MyTable, Long> {

}
