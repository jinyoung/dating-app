package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileDeleted extends AbstractEvent {

    private Integer userId;

    public UserProfileDeleted(User aggregate) {
        super(aggregate);
    }

    public UserProfileDeleted() {
        super();
    }
}
