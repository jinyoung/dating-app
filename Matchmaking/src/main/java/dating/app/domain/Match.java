package dating.app.domain;

import dating.app.MatchmakingApplication;
import dating.app.domain.MatchProfileCreated;
import dating.app.domain.MatchProfileDeleted;
import dating.app.domain.MatchProfileUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Match_table")
@Data
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer matchId;

    private String matchName;

    private Integer matchAge;

    private String matchGender;

    private String matchSexualOrientation;

    private String location;

    private List<String> interests;

    @PostPersist
    public void onPostPersist() {
        MatchProfileCreated matchProfileCreated = new MatchProfileCreated(this);
        matchProfileCreated.publishAfterCommit();

        MatchProfileUpdated matchProfileUpdated = new MatchProfileUpdated(this);
        matchProfileUpdated.publishAfterCommit();

        MatchProfileDeleted matchProfileDeleted = new MatchProfileDeleted(this);
        matchProfileDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static MatchRepository repository() {
        MatchRepository matchRepository = MatchmakingApplication.applicationContext.getBean(
            MatchRepository.class
        );
        return matchRepository;
    }
}
