package com.zhj.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhj.Service.ExamstudentService;
import com.zhj.bean.Examstudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 主要处理员工的CRUD请求，页面跳转功能
 *
 * @author : 曾小杰
 * @date : 2022-02-17 14:55
 **/

@Controller
public class ExanstudentController {

    @Autowired
    ExamstudentService service;

    // 这不是一个分页请求
    @RequestMapping("/list")
    // 接收一个name为pn的参数，默认值为1，表示第一页
    public String getStu(Model model, @RequestParam(value = "pn", defaultValue = "2") Integer pn) {
        // 进行分页，每页5条数据
        PageHelper.startPage(pn, 5);
        List<Examstudent> stus = service.getAll();
        // 使用pageInfo包装查询后的结果,只需要把pageInfo交给页面就行了
        // 封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数
        PageInfo<Examstudent> page = new PageInfo<Examstudent>(stus, 5);
        model.addAttribute("pageInfo", page);
        model.addAttribute("list", stus);
        return "list";
    }
}
