import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sem4{
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);


        ArrayList<String> listf = new ArrayList<String>();
        ArrayList<String> listn = new ArrayList<String>();
        ArrayList<String> listo = new ArrayList<String>();
        ArrayList<Integer> listage = new ArrayList<Integer>();
        ArrayList<String> listgen = new ArrayList<String>();
        ArrayList<Integer> listid = new ArrayList<Integer>();

        String in = scan.nextLine();
        int id = 0;

        while(!in.equals("q")){
            System.out.println(in);
            String[] st = new String[5];
            st = in.split(" ");
            list1.add(in);

            listf.add(st[0]);
            listn.add(st[1]);
            listo.add(st[2]);
            listage.add(Integer.parseInt(st[3]));
            listgen.add(st[4]);
            listid.add(id);
            in = scan.nextLine();


            id++;
        }
        //list1.remove(list1.size()-1);
        System.out.println(listf);
        System.out.println(listn);
        System.out.println(listo);
        System.out.println(listage);
        System.out.println(listgen);
        System.out.println(listid);


        int temp = 0;
        boolean flag = true;
        while(flag){
            for (int g = 0; g < listage.size()-1;g++){
                flag = false;
                if(listage.get(g) <= listage.get(g+1)){
                    temp = listage.get(g);
                    listage.set(g, listage.get(g+1));
                    listage.set(g+1, temp);
                    temp = listid.get(g);
                    listid.set(g, listid.get(g+1));
                    listid.set(g+1, temp);
                    flag = true;

                }
            }

        }

        for(int i: listid){
            System.out.println(list1.get(i));
        }






    }
}