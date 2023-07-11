package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NewMessage extends AbstractEvent {

    private String sender;
    private String message;

    public NewMessage(Chat aggregate) {
        super(aggregate);
    }

    public NewMessage() {
        super();
    }
}
