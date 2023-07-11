package dating.app.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class LikeCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String targetUser;
}
