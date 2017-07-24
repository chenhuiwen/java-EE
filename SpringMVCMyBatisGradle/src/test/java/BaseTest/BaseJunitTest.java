package BaseTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class BaseJunitTest {

}
