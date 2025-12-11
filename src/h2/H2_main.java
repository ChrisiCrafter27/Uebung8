package h2;

public class H2_main {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.append(12);
        list.append(45);
        list.append(66);
        list.append(12);
        list.append(45);
        System.out.println(list.insertAfter(45, 60));
        System.out.println(list.insertAfter(32, 60));
        System.out.println(list.findFirst(60));
        System.out.println(list.findFirst(32));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.delete(45));
        System.out.println(list.delete(32));
        System.out.println(list);
        System.out.println(list.delete(45));
        System.out.println(list);
        System.out.println(list.getLast());
    }
}
