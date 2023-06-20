public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}