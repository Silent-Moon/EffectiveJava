package ch2.item5;

class Lexicon extends Dictionary {
    private static final Lexicon INSTANCE = new Lexicon();

    static Lexicon getInstance() {
        return INSTANCE;
    }

    // Suppress default constructor for non-instantiability
    private Lexicon() {
    }
}
