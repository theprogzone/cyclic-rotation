import java.util.Arrays;

public class Main {

    public static int[] cyclicRotate(int[] A, int K) {
        int size = A.length;
        int[] shiftedArray = new int[size];
        for (int i = 0; i < size; i++) {
            K = K % size;
            int shiftedIndex = ((i + K) >= size) ? (i + K - size) : (i + K);
            shiftedArray[shiftedIndex] = A[i];
        }
        return shiftedArray;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] rotatedArray = cyclicRotate(A, K);
        System.out.print(Arrays.toString(rotatedArray));
    }
}
