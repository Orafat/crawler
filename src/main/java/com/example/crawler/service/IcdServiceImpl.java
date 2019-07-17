package com.example.crawler.service;


import com.example.crawler.entity.IcdPo;
import com.example.crawler.entity.IcdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IcdServiceImpl implements IcdService {
  //  protected static final Logger logger = LoggerFactory.getLogger(IcdServiceImpl.class);
    @Autowired
  IcdRepository icdRepository;
    @Override
    public void saveAll(List<IcdPo> icdList) {
        icdRepository.saveAll(icdList);
    }

  @Override
  public List<IcdPo> findByLevel(Integer level) {
    return icdRepository.findByLevel(level);
  }
}
