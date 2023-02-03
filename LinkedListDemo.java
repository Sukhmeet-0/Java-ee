import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.add(0,0);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
    }
}
