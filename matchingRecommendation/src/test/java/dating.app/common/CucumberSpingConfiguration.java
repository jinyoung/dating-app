package dating.app.common;

import dating.app.MatchingRecommendationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchingRecommendationApplication.class })
public class CucumberSpingConfiguration {}
