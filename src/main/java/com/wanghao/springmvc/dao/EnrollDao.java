package com.wanghao.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wanghao.springmvc.models.Enroll;
@Repository("enrollDao")
public interface EnrollDao {
    public int insert(Enroll enroll);
    public int update(Enroll enroll);
    public int deleteByCondition(Enroll enroll);
    public int deleteByID(long id);
    public List<Enroll> findByCondition(Enroll enroll);
    public List<Enroll> findAll();
    public Enroll findByID(long id);
    public Long findCountByCondition(Enroll enroll);
}
