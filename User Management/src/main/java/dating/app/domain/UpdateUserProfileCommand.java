package dating.app.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class UpdateUserProfileCommand {

        private Integer userId;
        private String name;
        private Integer age;
        private String gender;
        private String sexualOrientation;
        private List&lt;String&gt; interests;


}
