package com.wanghao.springmvc.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wanghao.springmvc.models.Enroll;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})

public class EnrollServiceTest {
    @Resource
    EnrollService enrollService;
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
    public void testFindByID() throws Exception {
	
	Enroll enroll=new Enroll();
	enroll=enrollService.findByID(1);
	System.out.println(enroll);
    }

    @Test
    public void testFindCountByCondition() {
	fail("Not yet implemented");
    }

}
