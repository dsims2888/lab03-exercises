import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class FindDuplicates {

    public static List<Integer> findDuplicates(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : l) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicates.add(key);
            }
        }
        return duplicates;
    }
        


    public static void main(String[] args) {
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicates(sample1));
        System.out.println("Sample 2: " + findDuplicates(sample2));
        System.out.println("Sample 3: " + findDuplicates(sample3));
        System.out.println("Sample 4: " + findDuplicates(sample4));
    }
}