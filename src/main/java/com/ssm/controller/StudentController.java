package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author hurong3
 * @date 2018/11/29 下午4:54
 */
@Controller
public class StudentController {
    private static final Logger logger=LoggerFactory.getLogger(StudentController.class);
    @Resource
    StudentService studentService;

    @RequestMapping("aaa")
    @ResponseBody
    public String aaa(){
        Student student=new Student();
        student.setStudentId("hu123");
        student.setStudentName("huhu");
        studentService.addOne(student);
        logger.info("=============aaa==========");
        return "aaa";
    }

    @RequestMapping("queryOne")
    @ResponseBody
    public Student queryOne(Integer id){
        Student student=studentService.queryById(id);
        logger.info("=============aaa==========");
        logger.error("NullPoint====");
        return student;
    }
}
