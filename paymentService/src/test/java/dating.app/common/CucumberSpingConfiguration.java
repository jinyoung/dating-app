package dating.app.common;

import dating.app.PaymentServiceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentServiceApplication.class })
public class CucumberSpingConfiguration {}
