import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
                BigDecimal cost = new BigDecimal("9.99");
                BigDecimal vat = new BigDecimal("0.23");

                BigDecimal grossValue = cost.multiply(BigDecimal.ONE.add(vat));

                BigDecimal netGross = grossValue.divide(BigDecimal.ONE.add(vat));
                BigDecimal totalValueExcludingVAT = netGross.multiply(new BigDecimal("10000"));

                System.out.println("The net price of the product is: " + cost);
                System.out.println("The VAT percentage is: " + vat);
                System.out.println("The gross value of the product including VAT is: " + grossValue.setScale(2, RoundingMode.HALF_UP));
                System.out.println("The gross value of the product excluding VAT is: " + netGross);
                System.out.println("The total value of 10,000 pieces of the product excluding VAT is: " + totalValueExcludingVAT.setScale(1, RoundingMode.HALF_UP));

    }
}