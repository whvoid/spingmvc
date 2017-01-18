package com.wanghao.springmvc.controller;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wanghao.springmvc.models.Enroll;
import com.wanghao.springmvc.responseModels.ResultData;
import com.wanghao.springmvc.service.EnrollService;
@Controller
@RequestMapping()
public class EnrollController {
    
    @Autowired
    private EnrollService enrollService;
    
    @RequestMapping(value = "enroll", method = RequestMethod.POST)
    @ResponseBody
    public ResultData<Enroll> add(@RequestBody Enroll enroll)
	    throws IOException {
	ResultData<Enroll> resultData = new ResultData<Enroll>();
	resultData.setStatus(0);
	resultData.setData(null);
	if (enroll == null) {
	    resultData.setMessage("参数错误：没有传入参数");
	} else {
	    try {
		int i = enrollService.insert(enroll);
		if (i == 1) {
		    resultData.setStatus(1);
		    resultData.setMessage("添加成功");
		    
		} else {
		    resultData.setMessage("添加失败");
		}
	    } catch (Exception e) {
		resultData.setMessage("添加失败:" + e.getMessage());
	    }
	}
	return resultData;
    }

    @RequestMapping(value = "enroll/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public ResultData<Enroll> update(@PathVariable("id") Long id,
	    @RequestBody Enroll enroll) throws IOException {
	ResultData<Enroll> resultData = new ResultData<Enroll>();
	resultData.setStatus(0);
	resultData.setData(null);
	if (enroll == null) {
	    resultData.setMessage("参数错误：没有传入参数");
	} else {
	    try {
		enroll.setId(id);
		int i = enrollService.update(enroll);
		if (i == 1) {
		    resultData.setStatus(1);
		    resultData.setMessage("修改成功");
		} else {
		    resultData.setMessage("修改失败");
		}
	    } catch (Exception e) {
		resultData.setMessage("修改失败:" + e.getMessage());
	    }
	}
	return resultData;
    }

    @RequestMapping(value = "enroll/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultData<Enroll> deleteByID(@PathVariable("id") Long id)
	    throws IOException {
	ResultData<Enroll> resultData = new ResultData<Enroll>();
	resultData.setStatus(0);
	resultData.setData(null);
	try {
	    int i = enrollService.deleteByID(id);
	    if (i == 1) {
		resultData.setStatus(1);
		resultData.setMessage("删除成功");
	    } else {
		resultData.setMessage("删除失败");
	    }
	} catch (Exception e) {
	    resultData.setMessage("删除失败:" + e.getMessage());
	}

	return resultData;
    }

    @RequestMapping(value = "enroll/deletebycondition", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultData<Enroll> deleteByCondition(@RequestBody Enroll enroll)
	    throws IOException {
	ResultData<Enroll> resultData = new ResultData<Enroll>();
	resultData.setStatus(0);
	resultData.setData(null);
	if (enroll == null) {
	    resultData.setMessage("参数错误：没有传入参数");
	} else {
	    try {
		int i = enrollService.deleteByCondition(enroll);
		if (i == 1) {
		    resultData.setStatus(1);
		    resultData.setMessage("删除成功");
		} else {
		    resultData.setMessage("删除失败");
		}
	    } catch (Exception e) {
		resultData.setMessage("删除失败:" + e.getMessage());
	    }
	}
	return resultData;
    }

    @RequestMapping(value = "enroll/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultData<Enroll> findByID(@PathVariable("id") Long id)
	    throws IOException {
	ResultData<Enroll> resultData = new ResultData<Enroll>();
	resultData.setStatus(0);
	resultData.setData(null);
	try {
	    resultData.setStatus(1);
	    Enroll enroll = enrollService.findByID(id);
	    resultData.setData(enroll);
	} catch (Exception e) {
	    resultData.setMessage("查询失败:" + e.getMessage());
	}

	return resultData;
    }
    @RequestMapping(value = "enroll", method = RequestMethod.GET)
    @ResponseBody
    public ResultData<List<Enroll>> findAll()
	    throws IOException {
	ResultData<List<Enroll>> resultData = new ResultData<List<Enroll>>();
	resultData.setStatus(0);
	resultData.setData(null);
	try {
	    resultData.setStatus(1);
	    List<Enroll> list=enrollService.findAll();
	    resultData.setData(list);
	} catch (Exception e) {
	    resultData.setMessage("查询失败:" + e.getMessage());
	}

	return resultData;
    }
    @RequestMapping(value = "enroll/findbycondition", method = RequestMethod.POST)
    @ResponseBody
    public ResultData<List<Enroll>> findByCondition(
	    @RequestBody Enroll enroll) throws IOException {
	ResultData<List<Enroll>> resultData = new ResultData<List<Enroll>>();
	resultData.setStatus(0);
	resultData.setData(null);
	if (enroll == null) {
	    resultData.setMessage("参数错误：没有传入参数");
	} else {
	    try {
		List<Enroll> enrollList = enrollService
			.findByCondition(enroll);
		resultData.setStatus(1);
		resultData.setData(enrollList);
	    } catch (Exception e) {
		resultData.setMessage("查询失败:" + e.getMessage());
	    }
	}
	return resultData;
    }

    @RequestMapping(value = "enroll/findcountbycondition", method = RequestMethod.POST)
    @ResponseBody
    public ResultData<Long> findCountByCondition(
	    @RequestBody Enroll enroll) throws IOException {
	ResultData<Long> resultData = new ResultData<Long>();
	resultData.setStatus(0);
	resultData.setData(null);
	if (enroll == null) {
	    resultData.setMessage("参数错误：没有传入参数");
	} else {

	    try {
		Long l = enrollService
			.findCountByCondition(enroll);
		resultData.setStatus(1);
		resultData.setData(l);
	    } catch (Exception e) {
		resultData.setMessage("查询失败:" + e.getMessage());
	    }
	}
	return resultData;
    }
}