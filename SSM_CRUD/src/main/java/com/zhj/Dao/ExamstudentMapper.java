package com.zhj.Dao;

import com.zhj.bean.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamstudentMapper {
    long countByExample(ExamstudentExample example);

    int deleteByExample(ExamstudentExample example);

    int deleteByPrimaryKey(Integer flowid);

    int insert(Examstudent record);

    int insertSelective(Examstudent record);

    List<Examstudent> selectByExample(ExamstudentExample example);

    Examstudent selectByPrimaryKey(Integer flowid);

    int updateByExampleSelective(@Param("record") Examstudent record, @Param("example") ExamstudentExample example);

    int updateByExample(@Param("record") Examstudent record, @Param("example") ExamstudentExample example);

    int updateByPrimaryKeySelective(Examstudent record);

    int updateByPrimaryKey(Examstudent record);

    List<Examstudent> selectAll();
}