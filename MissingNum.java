public class MissingNum {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int xor = 0;
        int xor2 = 0;
        for (int i = 1; i < arr.length + 1; i++) {
            xor = xor ^ i;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            xor2 = xor2 ^ arr[i];
        }
        System.out.print(xor ^ xor2);
    }

}
