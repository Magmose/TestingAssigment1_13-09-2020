package converter;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberToRomanNumeralConverter {
    private ArrayList<Integer> correspondingIntegerValues = new ArrayList<Integer>(Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1));
    private ArrayList<String> romanNumerals = new ArrayList<String>(Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"));

    public String convert(int numberToConvert) {
        String finalRomanNumeral = "";
        if (numberToConvert < 1 || numberToConvert > 3999){
            return ")=";
        }
        for (int i = 0; i < correspondingIntegerValues.size(); i++) {
            int currentNum = numberToConvert / correspondingIntegerValues.get(i);
            if (currentNum == 0) {
                continue;
            }
            for (int j = 0; j < currentNum; j++) {
                finalRomanNumeral += romanNumerals.get(i);
            }
            numberToConvert = numberToConvert % correspondingIntegerValues.get(i);
        }
        return finalRomanNumeral;
    }


}

