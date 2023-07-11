package dating.app.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class GiveFeedbackCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer rating;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String comment;
}
