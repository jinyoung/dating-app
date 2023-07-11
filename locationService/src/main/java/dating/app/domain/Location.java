package dating.app.domain;

import dating.app.LocationServiceApplication;
import dating.app.domain.WeatherProvided;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Location_table")
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Double latitude;

    private Double longitude;

    @PostPersist
    public void onPostPersist() {
        WeatherProvided weatherProvided = new WeatherProvided(this);
        weatherProvided.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static LocationRepository repository() {
        LocationRepository locationRepository = LocationServiceApplication.applicationContext.getBean(
            LocationRepository.class
        );
        return locationRepository;
    }
}
