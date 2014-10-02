package de.otto.codelab.randoms;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

/*

Java Übung, um über einige Zahlen verschiedene Operationen auszuführen:

Übung mit {@code N} Random()-Zahlen:

Summiert über eine Liste von Zahlen
Summiert die Quersumme
Vergleicht die Anzahl der positiven mit denen der negativen
Stellt die Verteilung von Zufallszahlen mit einer parametrisierbaren Genauigkeit (3 Intervalle; 1000 Intervalle) dar.

 -1 < -0.9: ***
 -0.9 < -0.8: *******
 -0.8 < -0.7: **
 …

*/
public class JRandom {

    private long size;

    public JRandom(long size) {
        this.size = size;
    }

    public void go() {
        Random random = new Random();

    }

    /**
     * sum of numbers
     */
    public int sum(Object arg) {
        throw new NotImplementedException();
    }

    /**
     * Summe der Quersumme
     */
    public int sumOfSumOfDigits(Object arg) {
        throw new NotImplementedException();
    }

    /**
     * Vergleicht die Anzahl der positiven mit denen der negativen Zahen
     */
    public Object positiveVersusNegative(Object arg) {
        throw new NotImplementedException();
    }

    /**
     * Zeigt die lückenlose Verteilung von Zufallszahlen in einem Intervall auf. Die Intervallgröße wird von 0
     * aus gemessen. Eine Intervallgröße von 0.1 kann nicht zu 0.15 -> 0.05 führen. 0 ist untere Grenze des Intervalls
     * 0 -> {@code interval} Eine Zahl kann nicht obere und untere Grenze sein, d.h. die Zuordnung zu einem Intervall ist
     * eindeutig.
     */
    public void printDistribution(Object arg, Object interval) {
        throw new NotImplementedException();
    }
}
