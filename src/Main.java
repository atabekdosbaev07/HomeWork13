import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++){
            a[i] = ran.nextInt(0,2);
        }
        method(a);
        for(int w :a){
            System.out.print(" "+w);
        }

      //  massive(a);


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ran.nextInt(0,2) );
        }
        method(list);
        System.out.println("\n"+list);



        LinkedList<Integer> List1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            List1.add(ran.nextInt(0,2) );
        }
        method(List1);
        System.out.println(List1);


    }

    public static void method(List list){
        Collections.sort(list);

    }

    public static void method(LinkedList list1){
        Collections.sort(list1);

    }

    public static void method(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

}

