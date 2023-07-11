package dating.app.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class ChatCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String recipient;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String message;
}
