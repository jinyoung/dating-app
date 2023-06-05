package dating.app.domain;

import dating.app.MatchmakingApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Interest_table")
@Data
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String interestName;

    public static InterestRepository repository() {
        InterestRepository interestRepository = MatchmakingApplication.applicationContext.getBean(
            InterestRepository.class
        );
        return interestRepository;
    }
}
