package ch2.item5;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

// Dependency injection provides flexibility and testability
public class SpellChecker<T extends Dictionary> {
    private final T dictionary;

    // Inject dependency when instance is created
    SpellChecker(Supplier<T> supplier) {
        this.dictionary = supplier.get();
    }

    public boolean isValid(String word) {
        return false;
    }

    public List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}
