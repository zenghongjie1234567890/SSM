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
 *  ����dao��Ĺ���
 *    �Ƽ�ʹ��Spring�ĵ�Ԫ����
 *       1:����SpringTestģ��
 *       2.@ContextConfigurationָ��Spring�����ļ���λ��
 *       3.ֱ��autowiredʹ�ýӿ�ӳ����
 * @author : ��С��
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
//        // ��������
//        ExamstudentMapper mapper = sqlSession.getMapper(ExamstudentMapper.class);
//        for (int i = 9; i < 1000; i++) {
//            String s1 = UUID.randomUUID().toString().substring(0, 5) + i;
//            String s2 = UUID.randomUUID().toString().substring(0, 5) + i;
//            mapper.insert(new Examstudent(i,4,s1,s2,"������","�㶫�����ѧ",99));
//        }
    }

}
