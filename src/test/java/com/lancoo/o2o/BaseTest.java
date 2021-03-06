package com.lancoo.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
    * @ClassName: BaseTest  
    * @Description: TODO(配置spring和Junit整合， Junit启动时加载SpringIOC容器)  
    * @author dongxiao  
    *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit spring 的配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {

}
