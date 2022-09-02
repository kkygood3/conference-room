package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "roomLists", path = "roomLists")
public interface RoomListRepository
    extends PagingAndSortingRepository<RoomList, Long> {
    // keep

}
