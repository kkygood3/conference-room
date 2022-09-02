package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "reservationLists",
    path = "reservationLists"
)
public interface ReservationListRepository
    extends PagingAndSortingRepository<ReservationList, Long> {
    // keep

}
