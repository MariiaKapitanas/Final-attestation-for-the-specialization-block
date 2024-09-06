package model.animal;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger counter = new AtomicInteger();

    public static String generateId() {
        return String.valueOf(counter.incrementAndGet());
    }
}
