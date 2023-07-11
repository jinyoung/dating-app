package dating.app.common;

import dating.app.ChatFunctionalityApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ChatFunctionalityApplication.class })
public class CucumberSpingConfiguration {}
