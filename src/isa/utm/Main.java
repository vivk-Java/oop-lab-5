package isa.utm;

import isa.utm.Alphabet.*;

public class Main {

    public static void main(String[] args) {
        Object[] alphabet = new Object[10];
        alphabet[0] = new A("may be A", new X("XXX"));
        alphabet[1] = new B("Another B");
        alphabet[2] = new C();
        alphabet[3] = new D("Dhe-Dhe");
        alphabet[4] = new E("It's E", new X("It's X"));
        alphabet[5] = new F("Press F to pay respect", new X("press F, not X"));
        alphabet[6] = new G("Great War was not a mistake!");
        alphabet[7] = new H("Hitler was not an Imposter.", new X("Last X override"));
        alphabet[8] = new I("I love U and I miss X, uUUUUUUUUUuuuuuuuuuuuuu");
        alphabet[9] = new J("Not a meme, just J it");

        for (var alpha: alphabet) {
            System.out.println(alpha.toString());
        }
    }
}
