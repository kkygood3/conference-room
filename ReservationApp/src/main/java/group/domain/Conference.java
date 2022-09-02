package group.domain;

import group.ReservationAppApplication;
import group.domain.ConferenceInformationChanged;
import group.domain.ConferenceReservationCanceled;
import group.domain.ConferenceReserved;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Conference_table")
@Data
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reserveId;

    private String name;

    private Long roomId;

    private Long hostId;

    @ElementCollection
    private List<Long> userIds;

    @PostPersist
    public void onPostPersist() {
        ConferenceReserved conferenceReserved = new ConferenceReserved(this);
        conferenceReserved.publishAfterCommit();

        //if(MeetingRoom.getUsed()) throw new RuntimeException("Room is already taken!");

        ConferenceInformationChanged conferenceInformationChanged = new ConferenceInformationChanged(
            this
        );
        conferenceInformationChanged.publishAfterCommit();
        // Get request from UserList
        //group.external.UserList userList =
        //    Application.applicationContext.getBean(group.external.UserListService.class)
        //    .getUserList(/** mapping value needed */);

    }

    @PreUpdate
    public void onPreUpdate() {}

    @PreRemove
    public void onPreRemove() {
        ConferenceReservationCanceled conferenceReservationCanceled = new ConferenceReservationCanceled(
            this
        );
        conferenceReservationCanceled.publishAfterCommit();
    }

    public static ConferenceRepository repository() {
        ConferenceRepository conferenceRepository = ReservationAppApplication.applicationContext.getBean(
            ConferenceRepository.class
        );
        return conferenceRepository;
    }
}
