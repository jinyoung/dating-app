package dating.app.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SendMessageCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String message;
}
