package ch2.item5;

import java.math.BigInteger;

public class TestDI {
    public static void main(String[] args) {
        SpellChecker<Lexicon> spellChecker = new SpellChecker<>(Lexicon::getInstance);
        BigInteger body = new BigInteger("0");
        System.out.println(body.flipBit(0));
    }
}
