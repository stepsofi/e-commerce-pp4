package org.example.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal initialLimit;

    public void assignLimit(BigDecimal initialLimit) {
        this.initialLimit = initialLimit;
    }

    public BigDecimal getBalance() {
        return this.initialLimit;
    }
}
