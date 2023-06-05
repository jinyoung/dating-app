package dating.app.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class UpdateMatchProfileCommand {

        private Integer matchId;
        private String matchName;
        private Integer matchAge;
        private String matchGender;
        private String matchSexualOrientation;
        private String location;
        private List&lt;String&gt; interests;


}
