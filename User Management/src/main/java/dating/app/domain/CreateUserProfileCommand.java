package dating.app.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateUserProfileCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer userId;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String name;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer age;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String gender;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String sexualOrientation;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; interests;


}
