package exercises.java;

import java.util.HashMap;
import java.util.Map;

public class Finder {
    private Map<Integer, String> valuesMap;

    public Finder() {
        this.valuesMap = new HashMap<>();
        valuesMap.put(1, "One");
        valuesMap.put(2, "Two");
        valuesMap.put(3, "Three");
        valuesMap.put(4, "Four");
        valuesMap.put(5, "Five");
    }

    public String find(Integer key) {
        return valuesMap.get(key);
    }
}
