package Crypto.model.currency_models.btc;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class BTC {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(length = 10, nullable = false)
    private String symbol;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private Date timestamp;
}
