package carrentkwon.common;

import carrentkwon.UserMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserMgmtApplication.class })
public class CucumberSpingConfiguration {}
