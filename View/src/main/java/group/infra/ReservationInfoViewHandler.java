package group.infra;

import group.domain.*;
import group.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationInfoViewHandler {


    @Autowired
    private ReservationInfoRepository reservationInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_CREATE_ (@Payload  ) {
        try {

            if (!.validate()) return;

            // view 객체 생성
            ReservationInfo reservationInfo = new ReservationInfo();
            // view 객체에 이벤트의 Value 를 set 함
            reservationInfo.set();
            // view 레파지 토리에 save
            reservationInfoRepository.save(reservationInfo);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




    // keep

}

