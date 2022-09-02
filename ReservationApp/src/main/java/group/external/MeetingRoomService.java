package group.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "MeetingRoom",
    url = "${api.url.MeetingRoom}",
    fallback = MeetingRoomServiceImpl.class
)
public interface MeetingRoomService {
    @RequestMapping(method = RequestMethod.GET, path = "/meetingRooms/{roomId}")
    public MeetingRoom getMeetingRoom(@PathVariable("roomId") Long roomId);
    // keep

}
