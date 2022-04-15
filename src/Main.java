import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{3, 5, 1}, {4, 15, 18}, {}, {9, 16, 8}};
        int totalLength = 0;
        boolean isTrue = true;

        for (int[] arrStr : array) {
            totalLength += arrStr.length;
            for (int arrCol : arrStr) {
            }
        }

        int[] newArray = new int[totalLength];
        int index = 0;

        for (int[] arrStr : array) {
            for (int arrCol : arrStr) {
                newArray[index] = arrCol;
                index++;
            }
        }

        System.out.println(Arrays.toString(newArray));

        while (isTrue) {
            isTrue = false;
            for (int j = 1; j < newArray.length; j++) {
                if (newArray[j] < newArray[j - 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j - 1];
                    newArray[j - 1] = temp;
                    isTrue = true;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}