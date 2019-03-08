package com.ssm.service.Impl;

import com.ssm.dao.StudentMapper;
import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hurong3
 * @date 2018/11/29 下午4:56
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public void one(Student student) {
        studentMapper.oneSelective(student);
    }

    @Override
    public Student queryById(Integer primaryKey) {
        return studentMapper.selectByPrimaryKey(primaryKey);
    }


}
