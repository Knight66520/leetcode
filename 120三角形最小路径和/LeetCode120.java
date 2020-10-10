import java.util.*;
public class LeetCode120 {
    public static void main(String[] args) {
        List a = Arrays.asList(2);
        List b = Arrays.asList(3, 4);
        List c = Arrays.asList(6, 5, 7);
        List d = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(a);
        triangle.add(b);
        triangle.add(c);
        triangle.add(d);
        System.out.println(miniWay(triangle));
    }

    public static int miniWay(List<List<Integer>> triangle) {
        int[] temp = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                temp[j] = Math.min(temp[j], temp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return temp[0];
    }
}
