package dating.app.common;

import dating.app.UserManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserManagementApplication.class })
public class CucumberSpingConfiguration {}
