package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MatchProfileUpdated extends AbstractEvent {

    private Integer matchId;

    public MatchProfileUpdated(Match aggregate) {
        super(aggregate);
    }

    public MatchProfileUpdated() {
        super();
    }
}
