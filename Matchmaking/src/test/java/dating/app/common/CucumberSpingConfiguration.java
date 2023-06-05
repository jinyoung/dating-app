package dating.app.common;

import dating.app.MatchmakingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchmakingApplication.class })
public class CucumberSpingConfiguration {}
