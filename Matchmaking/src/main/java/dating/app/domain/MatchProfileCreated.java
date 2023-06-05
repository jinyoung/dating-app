package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MatchProfileCreated extends AbstractEvent {

    private Integer matchId;

    public MatchProfileCreated(Match aggregate) {
        super(aggregate);
    }

    public MatchProfileCreated() {
        super();
    }
}
