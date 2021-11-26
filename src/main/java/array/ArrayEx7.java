package array;

public class ArrayEx7 {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        System.out.println("What's num?");
        for(int i =0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.printf("%d", numArr[i]);
        }
        System.out.println();
        for(int i =0; i < 100; i++) {

        }
        for(int i=0; i < 100; i++) {
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println("What's changed num?");
        for(int i = 0; i < numArr.length; i++) {
            System.out.printf("%d", numArr[i]);
        }
    }
}
