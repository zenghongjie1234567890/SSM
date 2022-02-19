package com.zhj.Service;

import com.zhj.bean.Examstudent;

import java.util.List;

/**
 * SSM
 *
 * @author : 曾小杰
 * @date : 2022-02-17 15:00
 **/

public interface ExamstudentService {
    // 查询所有员工信息
    List<Examstudent> getAll();
}

