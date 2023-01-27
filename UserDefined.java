import java.util.List;
import java.util.ArrayList;
class Emp{
	private String name;
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
}
public class UserDefined {
	public static void main(String[]args) {
		List a=new ArrayList();
		Emp e=new Emp("Sukh",21,"Accenture");
		Emp ee=new Emp("Harmeet",25,"IndusVirtue");
		Emp eee=new Emp("Gurmeet",52,"Self");
		
		a.add(e);
		a.add(ee);
		a.add(eee);
		System.out.println(a);
	}

}
