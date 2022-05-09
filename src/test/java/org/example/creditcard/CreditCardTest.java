package org.example.creditcard;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    @Test
    void assignLimitToCreditCard(){
        CreditCard creditCard = new CreditCard();
        creditCard.assignLimit(BigDecimal.valueOf(800));
        assertEquals(BigDecimal.valueOf(800), creditCard.getBalance());
    }
}
