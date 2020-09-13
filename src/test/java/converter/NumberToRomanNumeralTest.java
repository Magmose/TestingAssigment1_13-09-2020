package converter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Magnus Albeck Klitmose
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralTest {

    private NumberToRomanNumeralConverter c;

    @BeforeAll
    public void setUp() {
        c = new NumberToRomanNumeralConverter();
    }

    @Test
    public void mustBeAbleToCreateConverter() {

        // Assert
        assertNotNull(c);
    }

    @Test
    public void mustConvertOneToI() {

        // Act
        String excepted = "I";

        // Assert
        assertEquals(excepted, c.convert(1));
    }

    @Test
    public void mustConvertTwoToII() {

        // Act
        String excepted = "II";

        // Assert
        assertEquals(excepted, c.convert(2));
    }

    @Test
    public void mustConvertFiveToV() {

        // Act
        String excepted = "V";

        // Assert
        assertEquals(excepted, c.convert(5));
    }

    @Test
    public void mustConvertTenToX() {

        // Act
        String excepted = "X";

        // Assert
        assertEquals(excepted, c.convert(10));
    }

    @Test
    public void mustConvertFityToL() {

        // Act
        String excepted = "L";

        // Assert
        assertEquals(excepted, c.convert(50));
    }

    @Test
    public void mustConvertFiveHundredToD() {

        // Act
        String excepted = "D";

        // Assert
        assertEquals(excepted, c.convert(500));
    }

    @Test
    public void mustConvertThousandToM() {

        // Act
        String excepted = "M";

        // Assert
        assertEquals(excepted, c.convert(1000));
    }


    @Test
    public void mustCovertFourHundredFortyFour() {

        // Act
        String excepted = "CDXLIV";

        // Assert
        assertEquals(excepted, c.convert(444));
    }

    @Test
    public void mustCovertNineHundredNityNine() {

        // Act
        String excepted = "CMXCIX";

        // Assert
        assertEquals(excepted, c.convert(999));
    }

    @Test
    public void mustCovertOneThusandNineHundredNityNine() {

        // Act
        String excepted = "MCMXCIX";

        // Assert
        assertEquals(excepted, c.convert(1999));
    }

    @Test
    void mustConvertThreeThusandNineHundredNityNin() {
        // Act
        String excepted = "MMMCMXCIX";

        // Assert
        assertEquals(excepted, c.convert(3999));
    }

}
