package pages;


public class BasePage {

    char[] lettersArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] specialSymbolsArray = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray();

    public char[] getLettersArray() {
        return lettersArray;
    }

    public char[] getSpecialSymbolsArray() {
        return specialSymbolsArray;
    }
}
