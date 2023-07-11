package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WeatherProvided extends AbstractEvent {

    private String location;
    private String weather;

    public WeatherProvided(Location aggregate) {
        super(aggregate);
    }

    public WeatherProvided() {
        super();
    }
}
