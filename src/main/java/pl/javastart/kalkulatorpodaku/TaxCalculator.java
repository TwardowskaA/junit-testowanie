package pl.javastart.kalkulatorpodaku;

public class TaxCalculator {

    public double calculateTax(double income) {

        double tax=0;

        if(income < 85528 && (0.18 * income) - 556.02 > 0 ) {
            tax = (0.18 * income) - 556.02;
        } else if(income > 85528 ){
            tax = 14839.02 + (0.32 * ( income - 85528));
        } else if ((0.18 * income) - 556.02 < 0) {
            tax= 0;

        }
        return Math.round(tax);
    }
}
