package dating.app.domain;

import dating.app.UserManagementApplication;
import dating.app.domain.UserProfileDeleted;
import dating.app.domain.UserProfileUpdated;
import dating.app.domain.UserRegistered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String name;

    private Integer age;

    private String gender;

    private String sexualOrientation;

    private List<String> interests;

    @PostPersist
    public void onPostPersist() {
        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();

        UserProfileUpdated userProfileUpdated = new UserProfileUpdated(this);
        userProfileUpdated.publishAfterCommit();

        UserProfileDeleted userProfileDeleted = new UserProfileDeleted(this);
        userProfileDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserRepository repository() {
        UserRepository userRepository = UserManagementApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
