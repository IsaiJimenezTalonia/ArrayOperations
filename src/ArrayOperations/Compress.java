package ArrayOperations;

import java.util.*;

public class Compress {
    public List<String> compressArray(List<String> array){
        List<String> compressed = new ArrayList<>();
        Map<String, Integer> stringCount = new HashMap<>();

        array.forEach(st -> stringCount.put(st, Collections.frequency(array, st)));

        stringCount.entrySet().forEach(entry -> {
            if(entry.getValue() == 1){
                compressed.add(entry.getKey());
            }
            else if(entry.getValue() > 1){
                    compressed.add(entry.getKey() + entry.getValue());
            }
        });

        return compressed;
    }
}
