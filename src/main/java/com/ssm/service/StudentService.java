package com.ssm.service;

import com.ssm.entity.Student;

/**
 * @author hurong3
 * @date 2018/11/29 下午4:44
 */
public interface StudentService {

    void one(Student student);

    Student queryById(Integer primaryKey);
}
