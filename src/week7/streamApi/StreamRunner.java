package week7.streamApi;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamRunner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,4,6,7,7,9,10,10,13,17,17,20));


        Stream01.printNumbers(nums);
        System.out.println(" //stream  - forEach");
        Stream01 stream = new Stream01();
        stream.printNumbers(nums);
        Stream01.printNumbers2(nums);
        System.out.println(".printNumbers3");
        Stream01.printNumbers3(nums);
        System.out.println("   printNumbers4");
        Stream01.printNumbers4(nums);
        System.out.println("   printNumbers5");
        Stream01.printNumbers5(nums);
        System.out.println("   printNumbers56");
        Stream01.printNumbers6(nums);

        Stream02.printNumbers7(nums);
        System.out.println();
        Stream02.printNumbers8(nums);

    }
}
