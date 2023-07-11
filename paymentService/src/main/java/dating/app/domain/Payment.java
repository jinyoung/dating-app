package dating.app.domain;

import dating.app.PaymentServiceApplication;
import dating.app.domain.PaymentMade;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentId;

    private Double amount;

    private String currency;

    private String description;

    @PostPersist
    public void onPostPersist() {
        PaymentMade paymentMade = new PaymentMade(this);
        paymentMade.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentServiceApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
