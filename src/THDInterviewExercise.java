import ArrayOperations.Compress;
import ArrayOperations.Decompress;
import ArrayOperations.Reverse;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class THDInterviewExercise {



    public static void main (String[] args) {
        //Variable Declaration
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next(); //Scanning data as separated by comma String from input
        Compress compressOperation = new Compress();
        Decompress decompressOperation = new Decompress();
        Reverse reverseOperation = new Reverse();


        List<String> arr = Arrays.asList(st.split(",", -1)); //Split input in different elements an adding into a List

        //Compress Operation
        List<String> comp = compressOperation.compressArray(arr);
        System.out.println("Compressed: " + comp);

        //Decompress Operation
        List<String> dec = decompressOperation.decompressArray(comp);
        System.out.println("Decompressed: " + dec);

        List<String> rev = reverseOperation.reverseArray(arr);

        System.out.println("Reversed: " + rev);

    }
}
