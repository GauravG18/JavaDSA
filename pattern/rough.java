import java.util.*;

import javax.sound.midi.Soundbank;

public class rough {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] pairs = { { 1, 2 }, { 7, 8 }, { 4, 5 } };
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(pairs)); // 
    }
}
