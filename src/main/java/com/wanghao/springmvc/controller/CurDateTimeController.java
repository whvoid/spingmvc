package com.wanghao.springmvc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/date")
public class CurDateTimeController {
    /**
     * getDate 获取当前日期 yyyy-MM-dd http://localhost:8080/demo2/date/getdate/
     * 
     * @param mode
     * @return
     * @throws IOException
     * 
     */
    @RequestMapping(value="/getdate", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getDate(HttpServletResponse response)
	    throws IOException {
	SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
	String datetime = tempDate.format(new java.util.Date());
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("data", datetime);
	return map;
    }

    /**
     * getDate 获取当前时间 HH:mm:ss http://localhost:8080/demo2/date/gettime/
     * 
     * @param mode
     * @return
     * @throws IOException
     * 
     */
    @RequestMapping(value = "/gettime", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getTime(HttpServletResponse response)
	    throws IOException {
	SimpleDateFormat tempDate = new SimpleDateFormat("HH:mm:ss");
	String datetime = tempDate.format(new java.util.Date());
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("data", datetime);
	return map;
    }

    /**
     * getDate 获取当前时间 yyyy-MM-dd HH:mm:ss
     * http://localhost:8080/demo2/date/getdatetime/
     * 
     * @param mode
     * @return
     * @throws IOException
     * 
     */
    @RequestMapping(value = "/getdatetime", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getDateTime(HttpServletResponse response)
	    throws IOException {
	SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String datetime = tempDate.format(new java.util.Date());
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("data", datetime);
	return map;
    }
}
