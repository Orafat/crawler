package com.example.crawler.service;

import com.example.crawler.entity.IcdPo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IcdService {
    void saveAll(List<IcdPo> icdList);
    List<IcdPo> findByLevel(Integer level);
}
