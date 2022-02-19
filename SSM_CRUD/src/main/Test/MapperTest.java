import com.zhj.Dao.ExamstudentMapper;
import com.zhj.bean.Examstudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.UUID;

/**
 * SSM
 *  测试dao层的工作
 *    推荐使用Spring的单元测试
 *       1:导入SpringTest模块
 *       2.@ContextConfiguration指定Spring配置文件的位置
 *       3.直接autowired使用接口映射类
 * @author : 曾小杰
 * @date : 2022-02-16 22:35
 **/
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    private ExamstudentMapper examstudentMapper;

    @Autowired
    SqlSession sqlSession;


    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ExamstudentMapper bean = context.getBean(ExamstudentMapper.class);
        System.out.println(bean);
        System.out.println(examstudentMapper);
        List<Examstudent> examstudents = bean.selectAll();
        System.out.println(examstudents);
//        List<Examstudent> examstudents = examstudentMapper.selectAll();
//        // 批量操作
//        ExamstudentMapper mapper = sqlSession.getMapper(ExamstudentMapper.class);
//        for (int i = 9; i < 1000; i++) {
//            String s1 = UUID.randomUUID().toString().substring(0, 5) + i;
//            String s2 = UUID.randomUUID().toString().substring(0, 5) + i;
//            mapper.insert(new Examstudent(i,4,s1,s2,"赵银屏","广东海洋大学",99));
//        }
    }

}
