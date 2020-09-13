package converter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Magnus Albeck Klitmose
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CelsiusFahrenheitConverterTest {
    private CelsiusFahrenheitConverter c;

    @BeforeAll
    public void setUp() {
        c = new CelsiusFahrenheitConverter();
    }

    @Test
    public void mustConvertZeroCelsiusToFahrenheit(){
        // Act
        Double excepted = 32.0;

        // Assert
        assertEquals(excepted, c.convert("c",0));
    }

    @Test
    public void mustConvertZeroFahrenheitToCelsius(){
        // Act
        Double excepted = 0.0;

        // Assert
        assertEquals(excepted, c.convert("f",32));
    }


    @Test
    public void mustConvertTenCelsiusToFahrenheit(){
        // Act
        Double excepted = 50.0;

        // Assert
        assertEquals(excepted, c.convert("c",10));
    }

    @Test
    public void mustConvertFityFahrenheitToCelsius(){
        // Act
        Double excepted = 10.0;

        // Assert
        assertEquals(excepted, c.convert("f",50));
    }


    @Test
    public void  mustConvertThirtySevenCelsiusToFahrenheit(){
        // Act
        Double excepted = 98.6;

        // Assert
        assertEquals(excepted, c.convert("c",37));
    }

    @Test
    public void mustConvertNintyEigthPointSixFahrenheitToCelsius(){
        // Act
        Double excepted = 37.0;

        // Assert
        assertEquals(excepted, c.convert("f",98.6));
    }

    @Test
    public void  mustConvertMinusThirtySevenCelsiusToFahrenheit(){
        // Act
        Double excepted = -34.60;

        // Assert
        assertEquals(excepted, c.convert("c",-37));
    }

    @Test
    public void mustConvertMinusThirtyFourPointSixFahrenheitToCelsius(){
        // Act
        Double excepted = -37.0;

        // Assert
        assertEquals(excepted, c.convert("f",-34.60));
    }
}
