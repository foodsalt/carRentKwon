package carrentkwon.common;

import carrentkwon.CarRentalApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CarRentalApplication.class })
public class CucumberSpingConfiguration {}
