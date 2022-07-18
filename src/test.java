import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        boolean check = true;
        char letter = 'C';
        byte b = 12;
        short s = 213;
        int i = 12414;
        long l = -123453;
        float f = 234.231f;
        double d = 585.3;

        System.out.println("Byte - (" + Byte.MIN_VALUE + " : " + Byte.MAX_VALUE + ")");
        System.out.println("Short - (" + Short.MIN_VALUE + " : " + Short.MAX_VALUE + ")");
        System.out.println("Integer - (" + Integer.MIN_VALUE + " : " + Integer.MAX_VALUE + ")");
        System.out.println("Long - (" + Long.MIN_VALUE + " : " + Long.MAX_VALUE + ")");
        System.out.println("Float - (" + Float.MIN_VALUE + " : " + Float.MAX_VALUE + ")");
        System.out.println("Double - (" + Double.MIN_VALUE + " : " + Double.MAX_VALUE + ")");

        int arr [] = {2,8,2,6,3,7,8,4,9,0};
        int max_index = 0, min_index = 0, min = 10, max = -10;

        for (int j = 0; j < arr.length; j++){
            if (arr[j] > max) {
                max = arr[j];
                max_index = j;
            }
            if (arr[j] < min) {
                min = arr[j];
                min_index = j;
            }
        }

        System.out.println("Max value is - Arr[" + max_index + "] = " + max);
        System.out.println("Min value is - Arr[" + min_index + "] = " + min);
    }
}