package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ConferenceReservationCanceled extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private Date startTime;
    private Date endTime;
    private String name;
    private Long roomId;
    private Long hostId;
    private Object userIds;
    // keep

}
