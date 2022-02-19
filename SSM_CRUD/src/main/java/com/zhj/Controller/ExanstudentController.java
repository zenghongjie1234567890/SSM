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
 * ��Ҫ����Ա����CRUD����ҳ����ת����
 *
 * @author : ��С��
 * @date : 2022-02-17 14:55
 **/

@Controller
public class ExanstudentController {

    @Autowired
    ExamstudentService service;

    // �ⲻ��һ����ҳ����
    @RequestMapping("/list")
    // ����һ��nameΪpn�Ĳ�����Ĭ��ֵΪ1����ʾ��һҳ
    public String getStu(Model model, @RequestParam(value = "pn", defaultValue = "2") Integer pn) {
        // ���з�ҳ��ÿҳ5������
        PageHelper.startPage(pn, 5);
        List<Examstudent> stus = service.getAll();
        // ʹ��pageInfo��װ��ѯ��Ľ��,ֻ��Ҫ��pageInfo����ҳ�������
        // ��װ����ϸ�ķ�ҳ��Ϣ�����������ǲ�ѯ���������ݣ�����������ʾ��ҳ��
        PageInfo<Examstudent> page = new PageInfo<Examstudent>(stus, 5);
        model.addAttribute("pageInfo", page);
        model.addAttribute("list", stus);
        return "list";
    }
}
