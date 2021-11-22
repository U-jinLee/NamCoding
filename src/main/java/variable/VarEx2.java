package variable;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y= 20;
        int tmp = 0;
        System.out.printf("Before x:%d,y:%d", x, y);

        System.out.println("");

        tmp = x;
        x = y;
        y= tmp;
        System.out.printf("After x:%d,y:%d", x, y);
    }
}
