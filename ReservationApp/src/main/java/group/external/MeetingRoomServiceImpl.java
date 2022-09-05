package group.external;

import org.springframework.stereotype.Service;

@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    /**
     * Fallback
     */
    public MeetingRoom getMeetingRoom(Long id) {
        MeetingRoom meetingRoom = new MeetingRoom();
        return meetingRoom;
    }
    // keep

}