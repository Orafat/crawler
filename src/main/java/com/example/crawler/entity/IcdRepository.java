package com.example.crawler.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IcdRepository extends JpaRepository<IcdPo,String> {

    List<IcdPo> findByLevel(Integer level);

   /*  List<IcdPo> findAll();

    void flush();

    IcdPo saveAndFlush(IcdPo user);*/

    //List<IcdPo> saveAll(List<IcdPo> icdList);
}
