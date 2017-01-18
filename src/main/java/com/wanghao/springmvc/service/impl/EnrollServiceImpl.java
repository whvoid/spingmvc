package com.wanghao.springmvc.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanghao.springmvc.dao.EnrollDao;
import com.wanghao.springmvc.models.Enroll;
import com.wanghao.springmvc.service.EnrollService;
@Service
public class EnrollServiceImpl implements EnrollService{
    @Autowired
    private EnrollDao dao;
    public EnrollDao getDao() {
        return dao;
    }
    public void setDao(EnrollDao dao) {
        this.dao = dao;
    }
    @Override@Transactional
    public int insert(Enroll enroll)throws Exception {
	return dao.insert(enroll);
    }
    @Override@Transactional
    public int update(Enroll enroll)throws Exception {
	return dao.update(enroll);
    }
    @Override@Transactional
    public int deleteByCondition(Enroll enroll)throws Exception {
	return dao.deleteByCondition(enroll);
    }
    @Override@Transactional
    public int deleteByID(long id)throws Exception {
	return dao.deleteByID(id);
    }
    @Override@Transactional
    public List<Enroll> findByCondition(Enroll enroll)throws Exception {
	return dao.findByCondition(enroll);
    }
    @Override@Transactional
    public Enroll findByID(long id)throws Exception {
	return dao.findByID(id);
    }
    @Override@Transactional
    public Long findCountByCondition(Enroll enroll)throws Exception {
	return dao.findCountByCondition(enroll);
    }
    @Override
    public List<Enroll> findAll() throws Exception {
	return dao.findAll();
    }
}
