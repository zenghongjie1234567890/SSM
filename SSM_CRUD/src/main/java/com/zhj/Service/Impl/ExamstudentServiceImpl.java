package com.zhj.Service.Impl;

import com.zhj.Dao.ExamstudentMapper;
import com.zhj.Service.ExamstudentService;
import com.zhj.bean.Examstudent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * SSM
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-02-17 15:01
 **/

@Service
public class ExamstudentServiceImpl  implements ExamstudentService {

    @Autowired
    ExamstudentMapper examstudentMapper;

    public List<Examstudent> getAll() {
        return examstudentMapper.selectAll();
    }

}
