package Assignments;

import java.util.Random;

public class FirstPresident {

    private static final int[] YEARS = new int[]{
            1881, 1893, 1900, 1910, 1919, 1923, 1930, 1932, 1934, 1938
    };

    private static final String[] QUOTES = new String[]{
            "Who loves his homeland most is the person who does his mission best.",
            "Teachers are the one and only people who save nations.",
            "Everything we see in the world is the creative work of women.",
            "Our true mentor in life is science.",
            "Peace at home, peace in the world."
    };

    private static int getRandomYear() {
        return YEARS[new Random().nextInt(YEARS.length)];
    }

    private static String getRandomQuote() {
        return QUOTES[new Random().nextInt(QUOTES.length)];
    }

    public static void main(String[] args) {
        int year = getRandomYear();
        String quote = getRandomQuote();

        switch (year) {
            case 1881:
                System.out.printf("In %d, Mustafa was born in Salonika.", year);
                break;

            case 1893:
                System.out.printf("In %d, Mustafa was given the additional name Kemal at military school.", year);
                break;

            case 1919:
                System.out.printf("In %d, Mustafa Kemal landed in Samsun.", year);
                break;

            case 1923:
                System.out.printf("In %d, Mustafa Kemal was elected as the first president of the Republic of Turkey.", year);
                break;

            case 1932:
                System.out.printf("In %d, Mustafa Kemal founded the Turkish Linguistic Society.", year);
                break;

            case 1934:
                System.out.printf("In %d, The Grand National Assembly of Turkey granted him the surname Ataturk.", year);
                break;

            case 1938:
                System.out.printf("In %d, Ataturk died in Istanbul.", year);
                break;

            default:
                System.out.println("One of his favorite saying is: " + quote);
        }
    }
}
