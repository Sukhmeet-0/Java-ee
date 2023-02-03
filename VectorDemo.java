
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        Vector<Object> vector=new Vector<>();
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());

        vector.add(1);
        vector.add(10.7);
        vector.addElement("Sukhmeet");

        System.out.println(vector);

        Vector<Object> vector1=new Vector<>(3);
        System.out.println(vector1.capacity());

        ArrayList<Object> a=new ArrayList<>();
        a.add(23);

        Vector<Object> vector2=new Vector<>();
        vector2.add(a);

        System.out.println(vector2);

        Vector<Object> vector3=new Vector<>(1,1);
        System.out.println(vector3.capacity());
        vector3.add(1);
        vector3.add(1);
        System.out.println(vector3.capacity());

        Enumeration<Object> e=vector.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+" -> ");
        }
        System.out.println();

        Iterator<Object> itr=vector3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        System.out.println();

    }
}
