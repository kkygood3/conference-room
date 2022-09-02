package group.common;

import group.RoomReservationAppApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RoomReservationAppApplication.class })
public class CucumberSpingConfiguration {}
