package dating.app.domain;

import dating.app.domain.*;
import dating.app.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentMade extends AbstractEvent {

    private String paymentId;
    private Double amount;
    private String currency;

    public PaymentMade(Payment aggregate) {
        super(aggregate);
    }

    public PaymentMade() {
        super();
    }
}
