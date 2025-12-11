package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b = new Bruch(112432, -456);
        b.shorten();
        System.out.println(b);
        System.out.println(b.hasSameValueAs(new Bruch(112432, -456)));
    }
}
