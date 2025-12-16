import java.util.*;

public class HashMapImp {
    public static void main(String[] args) {
        //FREQUENCY COUNTER
        
        int[] arr = {1,2,3,4,1,2,2,1,1,1,1,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
