package practiceQuestions.q14;

import java.util.HashMap;

public class Assignment1 {

    public static void main(String[] args) {
        Mapping countryMap = new Mapping();

        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");
        countryMap.saveCountryCapital("USA", "Washington, D.C.");

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));
        System.out.println(countryMap.toArrayList());

        HashMap<String, String> M2 = countryMap.swapKyeValue();
        System.out.println(M2);
    }

}