package converter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelsiusFahrenheitConverter {
    private final Double CONVERTRATE = 32.00;


    public double convert(String converterType, double integerToConvert) {
        if (converterType == "c") {
            BigDecimal bd = new BigDecimal((9.0 / 5.0) * integerToConvert + CONVERTRATE).setScale(2, RoundingMode.HALF_UP);
            double fahrenheit = bd.doubleValue();
            return fahrenheit;
        }

        if (converterType == "f") {
            BigDecimal bd = new BigDecimal((5.0 / 9.0) * (integerToConvert - CONVERTRATE)).setScale(2, RoundingMode.HALF_UP);
            double celsius = bd.doubleValue();
            return celsius;
        }
        return 0;
    }
}
