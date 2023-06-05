package dating.app.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateMatchProfileCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer matchId;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String matchName;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer matchAge;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String matchGender;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String matchSexualOrientation;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String location;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; interests;


}
