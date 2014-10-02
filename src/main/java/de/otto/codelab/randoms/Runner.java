package de.otto.codelab.randoms;

public class Runner {

    public static void main(String[] args) {
        new JRandom(Long.parseLong(args[0])).go();
    }
}
