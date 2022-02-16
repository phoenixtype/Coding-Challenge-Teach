package ConditionalStatement_1.src.com.phoenixtype.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionHashMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> myMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (myMap.get(s) != null)
                System.out.println(s + "=" + myMap.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
