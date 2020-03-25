package march.twentytwo.homework;
import java.util.HashMap;
public class HomeWorkHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Razib", 36);
        people.put("Biplob", 30);
        people.put("Infix", 10);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));

        }
    }

}