package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "meetingRoomLists",
    path = "meetingRoomLists"
)
public interface MeetingRoomListRepository
    extends PagingAndSortingRepository<MeetingRoomList, Long> {
    // keep

}
