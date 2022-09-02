package group.common;

import group.UserListManageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserListManageApplication.class })
public class CucumberSpingConfiguration {}
