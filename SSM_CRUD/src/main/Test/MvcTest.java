import com.github.pagehelper.PageInfo;
import com.zhj.bean.Examstudent;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * SSM
 *
 * @author : ��С��
 * @date : 2022-02-19 08:03
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:springMVC.xml" })
public class MvcTest extends AbstractJUnit4SpringContextTests {
    // ����Springmvc��ioc
    @Autowired
    WebApplicationContext context;
    // ����mvc���󣬻�ȡ����������
    MockMvc mockMvc;

    @Before
    public void initMokcMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //ģ�������õ�����ֵ
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/list").param("pn", "5")).andReturn();

        //����ɹ��Ժ��������л���pageInfo�����ǿ���ȡ��pageInfo������֤
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("��ǰҳ�룺"+pi.getPageNum());
        System.out.println("��ҳ�룺"+pi.getPages());
        System.out.println("�ܼ�¼����"+pi.getTotal());
        System.out.println("��ҳ����Ҫ������ʾ��ҳ��");
        int[] nums = pi.getNavigatepageNums();
        for (int i : nums) {
            System.out.print(" "+i);
        }

        //��ȡԱ������
        List<Examstudent> list = pi.getList();
        for (Examstudent examstudent: list) {
            System.out.println("ID��"+examstudent.getFlowid()+"==>Name:"+examstudent.getStudentname());
        }

    }

    @Test
    public void ter(){
        System.out.println(mockMvc);
    }

    @Test
    public void ter1(){
        System.out.println(context);
    }

}
