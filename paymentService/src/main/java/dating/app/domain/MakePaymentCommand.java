package dating.app.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class MakePaymentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Double amount;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String currency;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String description;
}
