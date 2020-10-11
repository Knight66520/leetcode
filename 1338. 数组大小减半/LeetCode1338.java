import java.util.*;
public class LeetCode1338 {
    public static void main(String[] args) {
        int[] arr={3,3,3,3,5,5,5,2,2,7};
        //int[] arr={3,3,3,3};
        //int[] arr = {1, 9};
        System.out.println(minSetSize(arr));
    }
    public static int minSetSize(int[] arr) {
        Map counts= new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(counts.containsKey(arr[i])){
                counts.put(arr[i],(int)counts.get(arr[i])+1);
            }else {
                counts.put(arr[i],1);
            }
        }
        Object[] arrs = counts.values().toArray();
        Arrays.sort(arrs);
        int result=0;
        int j;
        for(j=arrs.length-1;2*result<arr.length;j--)
            result+=(int)arrs[j];
        return arrs.length-j-1;
    }
}

