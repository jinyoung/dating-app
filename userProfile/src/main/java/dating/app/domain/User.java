package dating.app.domain;

import dating.app.UserProfileApplication;
import dating.app.domain.NewMessage;
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
    private String name;

    private Integer age;

    private String status;

    private String interests;

    @PostPersist
    public void onPostPersist() {
        NewMessage newMessage = new NewMessage(this);
        newMessage.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserRepository repository() {
        UserRepository userRepository = UserProfileApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
