package group.external;

import java.util.Date;
import lombok.Data;

@Data
public class MeetingRoom {

    private Long roomId;
    private String name;
    private String location;
    private Boolean used;
    private String remark;
    // keep

}
