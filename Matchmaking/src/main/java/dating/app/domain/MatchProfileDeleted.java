package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MatchProfileDeleted extends AbstractEvent {

    private Integer matchId;

    public MatchProfileDeleted(Match aggregate) {
        super(aggregate);
    }

    public MatchProfileDeleted() {
        super();
    }
}
