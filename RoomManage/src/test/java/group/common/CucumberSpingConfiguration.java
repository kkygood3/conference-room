package group.common;

import group.RoomManageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RoomManageApplication.class })
public class CucumberSpingConfiguration {}
