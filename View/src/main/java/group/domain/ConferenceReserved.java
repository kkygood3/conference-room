package group.domain;

import group.infra.AbstractEvent;
import lombok.Data;
//import java.util.Date;
import java.util.*;

@Data
public class ConferenceReserved extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private String name;
    private Integer roomId;
    private Integer hostId;
    private List<Long> userIds;
}
