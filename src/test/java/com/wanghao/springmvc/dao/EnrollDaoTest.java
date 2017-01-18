package com.wanghao.springmvc.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wanghao.springmvc.models.Enroll;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class EnrollDaoTest {
    @Resource
    private EnrollDao enrollDao;
    @Test
    public void testInsert() {
	fail("Not yet implemented");
    }

    @Test
    public void testUpdate() {
	fail("Not yet implemented");
    }

    @Test
    public void testDeleteByCondition() {
	fail("Not yet implemented");
    }

    @Test
    public void testDeleteByID() {
	fail("Not yet implemented");
    }

    @Test
    public void testFindByCondition() {
	fail("Not yet implemented");
    }

    @Test
    public void testFindByID() {
	
	Enroll enroll=new Enroll();
	enroll=enrollDao.findByID(1);
	System.out.println(enroll);
    }

    @Test
    public void testFindCountByCondition() {
	fail("Not yet implemented");
    }

}
