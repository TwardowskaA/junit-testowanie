package pl.javastart.kalkulatorpodaku;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaxCalculatorTest {


    @Test
    public void shouldReturnTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        double podatek = 10000;
        double result = taxCalculator.calculateTax(podatek);

        assertThat(result, is(1244.00));
    }
    
}
