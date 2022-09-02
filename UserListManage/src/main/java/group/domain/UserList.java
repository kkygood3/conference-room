package group.domain;

import group.UserListManageApplication;
import group.domain.UserDeleted;
import group.domain.UserRegistered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserList_table")
@Data
public class UserList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;

    private String userPhoneNumber;

    private String userEmail;

    @PostPersist
    public void onPostPersist() {
        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();

        UserDeleted userDeleted = new UserDeleted(this);
        userDeleted.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static UserListRepository repository() {
        UserListRepository userListRepository = UserListManageApplication.applicationContext.getBean(
            UserListRepository.class
        );
        return userListRepository;
    }
}
