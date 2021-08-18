

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Double d = -78.0;
//
//        System.out.println(Integer.toHexString(d.hashCode()));

//        Long l = -78L;
//        System.out.println(Integer.toHexString(l.hashCode()));

//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));

        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(16);

//        chm.put(1, "one");
//        chm.put(222, "222e");
//        chm.put(4545, "4545e");

//        System.out.println(chm.get(1));

//       Random random = new Random();
//
        for (int i = 0; i < 100; i++) {
            chm.put(i, "");
        }

//        System.out.println(chm);

        chm.delete(5);
        chm.delete(85);
        chm.delete(100);
        chm.delete(0);

        System.out.println(chm);


//        HashMap<Integer, String> hm = new HashMap<>(16);
//        for (int i = 0; i <100; i ++){
//            hm.put(i, "");
//        }
//
//        System.out.println(hm);


//        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>();
//
//        lphm.put(1, "one");
//        lphm.put(222, "222e");
//        lphm.put(4545, "4545e");
//
//        System.out.println(lphm.get(222));


    }
}
