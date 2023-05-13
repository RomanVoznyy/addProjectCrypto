package Crypto.model.currency_models.eth;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ETH {
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
