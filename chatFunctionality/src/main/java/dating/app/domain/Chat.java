package dating.app.domain;

import dating.app.ChatFunctionalityApplication;
import dating.app.domain.NewMessage;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Chat_table")
@Data
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String displayName;

    private String members;

    @PostPersist
    public void onPostPersist() {
        NewMessage newMessage = new NewMessage(this);
        newMessage.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ChatRepository repository() {
        ChatRepository chatRepository = ChatFunctionalityApplication.applicationContext.getBean(
            ChatRepository.class
        );
        return chatRepository;
    }
}
