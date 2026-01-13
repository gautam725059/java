public class MergeSort {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int n = array1.length;
        int m = array2.length;

        int[] merged = new int[n + m];
        int i = 0, j = 0,k=0;

        
        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }

        
        while (i < n) {
            merged[k++] = array1[i++];
        }

        while (j < m) {
            merged[k++] = array2[j++];
        }

        
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}