import java.util.Arrays;
import java.util.Random;

public class s1 {
    public static void main(String[] args) {
        //1
        int i = new Random().nextInt(2000);
        System.out.println(i);
        //2
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);
        //3

        int count = 0;

        for(int j = i; j < Short.MAX_VALUE; j++){
            if(j % n == 0){
                count++;
            }
        }
        int[]m1 = new int[count];
        int c = 0;
        for(int k = i; k < Short.MAX_VALUE; k++){
            if(k % n == 0){
                m1[c++] = k;
            }
        }
                System.out.println(Arrays.toString(m1));

        //4

        int b = 0;
        for(int x = Short.MIN_VALUE; x < i; x++){
            if(x % n != 0){
                b++;
            }
        }
        int[]m2 = new int[b];
        int d = 0;
        for(int z = Short.MIN_VALUE; z < i; z++){
            if(z % n != 0){
                m2[d++] = z;
            }
        }
        System.out.println(Arrays.toString(m2));

            }




        }
