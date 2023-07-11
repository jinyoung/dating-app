package dating.app.common;

import dating.app.LocationServiceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { LocationServiceApplication.class })
public class CucumberSpingConfiguration {}
