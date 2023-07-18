package ArrayOperations;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public List<String> reverseArray(List<String> arr) {
        // Write your code here
        List<String> reversed = new ArrayList<String>();
        for(int i = arr.size()-1; i >= 0; i-- ) {
            reversed.add(arr.get(i));
        }

        return reversed;


    }

}
