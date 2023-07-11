package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserLiked extends AbstractEvent {

    private String liker;
    private String likedUser;

    public UserLiked(Recommendation aggregate) {
        super(aggregate);
    }

    public UserLiked() {
        super();
    }
}
