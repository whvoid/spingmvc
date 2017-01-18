package com.wanghao.springmvc.service;

import java.util.List;

import com.wanghao.springmvc.models.Enroll;

public interface EnrollService {
    public int insert(Enroll enroll)throws Exception;
    public int update(Enroll enroll)throws Exception;
    public int deleteByCondition(Enroll enroll)throws Exception;
    public int deleteByID(long id)throws Exception;
    public List<Enroll> findAll()throws Exception;
    public List<Enroll> findByCondition(Enroll enroll)throws Exception;
    public Enroll findByID(long id)throws Exception;
    public Long findCountByCondition(Enroll enroll)throws Exception;
}
