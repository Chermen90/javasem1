import java.lang.reflect.Array;
import java.util.Arrays;

public class sem2 {

    public static void main(String[] args){

        //2
       double start_point = System.currentTimeMillis();
       double end_point = System.currentTimeMillis();
       double time_consumed = end_point - start_point;

        String my_string = "Самолет построим сами, " +
                "Понесемся над лесами, " +
                "Понесемся над лесами, " +
                "А потом вернемся к маме.";

        System.out.println(my_string);
        start_point = System.currentTimeMillis();
        System.out.println(my_string.replace("лесами", "полями"));
        end_point = System.currentTimeMillis();
        time_consumed = end_point - start_point;
        System.out.println(time_consumed);

        String target = "лесами";
        start_point = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(target) > 0){
            sb.replace(sb.indexOf(target), sb.indexOf(target)+target.length(), "полями");
        }
        System.out.println(sb);
        end_point = System.currentTimeMillis();
        time_consumed = end_point - start_point;
        System.out.println(time_consumed);



        //System.out.println(parse_string("Основание -5 степень 3, результат"));

    }

    //1

    public static String parse_string(String input){
         String[] toarr = input.split(" ");
         System.out.println(Arrays.toString(toarr));
         int base = 0;
         int power = 0;
         double product = 0;
        for(int i = 0; i < toarr.length; i++){
            toarr[i] = toarr[i].replace(",", "");

            try {
                Integer.parseInt(toarr[i]);
                if (base == 0) {
                    base = Integer.parseInt(toarr[i]);
                } else {
                    power = Integer.parseInt(toarr[i]);
                }
            } catch (Exception e){
                continue;
            }

        }
        product = (int) Math.round(Math.pow(base, power));
        //System.out.println(Arrays.toString(toarr));

        //System.out.println(power);
        //System.out.println(base);
        //System.out.println(product);
        return String.format("%s, %f", input, product);
    }



}
