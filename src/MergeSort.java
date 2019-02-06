
import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int ...data){
        int merged[] = new int[data.length];

        if (data.length == 1){
            return data;
        }

        int middle_point = data.length/2;
        int first[] = mergeSort(Arrays.copyOfRange(data,
                0, middle_point));
        int second[] = mergeSort(Arrays.copyOfRange(data,
                middle_point, data.length));

        int idx_1 = 0, idx_2 = 0;
        for (int idx=0; idx<(first.length+second.length); idx++ ){
            int value1 = Integer.MAX_VALUE, value2 = Integer.MAX_VALUE;

            if (first.length > idx_1){
                value1 = first[idx_1];
            }

            if (second.length > idx_2){
                value2 = second[idx_2];
            }

            int sorted = Math.min(value1, value2);

            if(sorted == value1){
                idx_1++;
            } else {
                idx_2++;
            }

            merged[idx] = sorted;
        }

        return merged;
    }

}

