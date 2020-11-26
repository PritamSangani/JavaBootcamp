/**
 * @author Omar Bashir
 */
package bootcamp.kata.data;

import java.math.BigDecimal;

public class Results {
    private final BigDecimal sum;
    private final BigDecimal difference;
    private final BigDecimal product;
    private final BigDecimal quotient;

    public Results(final BigDecimal sum, final BigDecimal difference, final BigDecimal product, final BigDecimal quotient) {
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.quotient = quotient;
    }

    public final BigDecimal getSum() {
        return this.sum;
    }

    public final BigDecimal getDifference() {
        return this.difference;
    }

    public final BigDecimal getProduct() {
        return this.product;
    }

    public final BigDecimal getQuotient() {
        return this.quotient;
    }
}
