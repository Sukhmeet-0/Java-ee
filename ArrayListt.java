import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListt{
    public static void main(String[] args) {
    	// default size is 10
        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        
        System.out.println(arrayList);
        
        List a=new ArrayList(2);
        a.add(13);
        // with index position
        a.add(0,12);
        //replaces element at particular index
        a.set(0, 11);
        a.add("Hello");
        System.out.println(a);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Hello"));
        System.out.println(arrayList.get(4));
//        System.out.println(arrayList.removeAll(a));
        System.out.println(arrayList.retainAll(a));
        System.out.println(arrayList);
        
        // iterators
        //for
        for(int i=0;i<arrayList.size();i++) {
        	System.out.print(arrayList.get(i)+" ");
        }
        // for each
        System.out.println();
        for(Object i:arrayList) {
        	System.out.print(i+" ");
        }
        System.out.println();
        // iterator
        
        Iterator i=arrayList.iterator();
        while(i.hasNext()) {
        	Object obj=(Object)i.next();
        	System.out.print(obj+" ");
        }
    }
}