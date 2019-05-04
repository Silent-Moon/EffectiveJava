package ch4.item18;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

public class TestComposition {
    public static void main(String[] args) {
        InstrumentedSet<Instant> instants = new InstrumentedSet<>(new HashSet<>());
        instants.add(Instant.now());
        System.out.println(instants.getAddCount());
        instants.addAll(Arrays.asList(Instant.now(), Instant.now()));
        System.out.println(instants.getAddCount());
    }
}
