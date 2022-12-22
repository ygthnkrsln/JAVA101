package Lecture_Studies.Lecture6.RandomCharacter;

public class RandomCharacter {
    static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
