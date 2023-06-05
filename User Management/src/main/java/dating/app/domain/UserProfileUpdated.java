package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileUpdated extends AbstractEvent {

    private Integer userId;

    public UserProfileUpdated(User aggregate) {
        super(aggregate);
    }

    public UserProfileUpdated() {
        super();
    }
}
