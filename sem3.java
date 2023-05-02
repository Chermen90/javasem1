import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//1
public class sem3 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(rand.nextInt(100));
        }

        System.out.println("лист: " + nums);
        Comparator<Integer> cmp = new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        Collections.sort(nums, cmp);
        System.out.println("лист после сортировки: " + nums);

        //2
        Iterator<Integer> i = nums.iterator();
        while( i.hasNext()) {
            if (i.next() % 2 == 0) {
                i.remove();
            }
        }
        System.out.println("лист после удаления чётных: " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println(max);
        System.out.println(min);

     //4
        double start_point = System.currentTimeMillis();
        double end_point = System.currentTimeMillis();
        double time_consumed = end_point - start_point;


        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList(Arrays.asList(4, 5, 6, 7, 8));


        System.out.println(list1);
        System.out.println(list2);


        for (int num : list2) {
            if (!list1.contains(num)) {
                list1.add(num);
            }
        }


        System.out.println("результат: " + list1);


        List<Integer> newArr = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        start_point = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
            newArr.add(0, 0);
        }

        System.out.println(newArr);
        end_point = System.currentTimeMillis();
        time_consumed = end_point - start_point;
        System.out.println(time_consumed);

        List<Integer> newList = new LinkedList();
        start_point = System.currentTimeMillis();
        for(int k = 0; k < 10000; k++){
            ((LinkedList<Integer>) newList).addFirst(0);
        }

        System.out.println(newList);
        end_point = System.currentTimeMillis();
        time_consumed = end_point - start_point;
        System.out.println(time_consumed);
    }


    }
