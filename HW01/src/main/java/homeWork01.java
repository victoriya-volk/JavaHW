
import java.util.Arrays;
import java.util.Random;

public class homeWork01 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        int n = Integer.toBinaryString(i).length();
        StringBuilder m1_str_build = new StringBuilder();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0){
                m1_str_build.append(String.valueOf(j)).append(", ");
            }
        }
        String m1_str = String.valueOf(m1_str_build);
        String[] m1_split = m1_str.split(", ");
        int [] m1 = new int[m1_split.length];
        for (int t = 0; t < m1.length; t++) {
            m1[t] = Integer.parseInt(m1_split[t]);
        }
        System.out.println(Arrays.toString(m1));

        StringBuilder m2_str_build = new StringBuilder();
        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0){
                m2_str_build.append(String.valueOf(k)).append(", ");
            }
        }
        String m2_str = String.valueOf(m2_str_build);
        String[] m2_split = m2_str.split(", ");

        int [] m2 = new int[m2_split.length];
        for (int g = 0; g < m2.length; g++) {
            m2[g] = Integer.parseInt(m2_split[g]);
        }
        System.out.println(Arrays.toString(m2));
        System.out.println("Число: " + i + ", номер старшего значащего бита: " + n);
    }
}
