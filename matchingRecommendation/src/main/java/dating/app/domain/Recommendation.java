package dating.app.domain;

import dating.app.MatchingRecommendationApplication;
import dating.app.domain.UserLiked;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Recommendation_table")
@Data
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Integer age;

    private String interests;

    @PostPersist
    public void onPostPersist() {
        UserLiked userLiked = new UserLiked(this);
        userLiked.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RecommendationRepository repository() {
        RecommendationRepository recommendationRepository = MatchingRecommendationApplication.applicationContext.getBean(
            RecommendationRepository.class
        );
        return recommendationRepository;
    }
}
