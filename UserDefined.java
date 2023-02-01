import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
class Emp{
	String name;
	int age;
	String compName;
	Emp(String name,int age,String compName){
		this.name=name;
		this.age=age;
		this.compName=compName;
	}
	public String toString() {
		return name+" "+age+" "+compName;
	}
	public void show(){
		System.out.println(age+" "+name+" "+compName);
	}
}
public class UserDefined {
	public static void main(String[]args) {
		List<Object> a=new ArrayList<>();
		Emp e=new Emp("Sukh",21,"Accenture");
		Emp ee=new Emp("Harmeet",25,"IndusVirtue");
		Emp eee=new Emp("Gurmeet",52,"Self");
		
		a.add(e);
		a.add(ee);
		a.add(eee);
		// System.out.println(a); 

		// Iterator itr=a.iterator();
		// while(itr.hasNext()){
		// 	Emp emp=(Emp) itr.next();
		// 	emp.show();
		// }

		// a.forEach((b)->System.out.println(b));
		ListIterator li=a.listIterator();
		while(li.hasNext()){
			Emp temp=(Emp) li.next();
			temp.show();
		}
		

        
	}

}
