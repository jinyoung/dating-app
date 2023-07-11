package dating.app.common;

import dating.app.FeedbackServiceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FeedbackServiceApplication.class })
public class CucumberSpingConfiguration {}
