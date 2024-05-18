package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.MyBookList;

public interface MyBookListRepository extends JpaRepository<MyBookList, Integer>{

}
