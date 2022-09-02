package group.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ReservationList_table")
@Data
public class ReservationList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
