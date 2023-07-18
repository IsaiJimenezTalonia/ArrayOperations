package ArrayOperations;

import java.util.ArrayList;
import java.util.List;

public class Decompress {

    public List<String> decompressArray(List<String> array){
        List<String> decompressed = new ArrayList<>();
        int number = 1;

        for(String st : array){
            String clean = st.replaceAll("\\D+","");
            String cleanChar = st.replaceAll("[0-9]","");
            if(clean.isBlank()) {
                number = 1;
            }
            else{
                number = Integer.parseInt(clean);
            }
            for(int i = 0; i<number; i++){
                decompressed.add(cleanChar);
            }
        }


        return decompressed;
    }
}
