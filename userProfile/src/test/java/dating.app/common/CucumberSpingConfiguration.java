package dating.app.common;

import dating.app.UserProfileApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserProfileApplication.class })
public class CucumberSpingConfiguration {}
