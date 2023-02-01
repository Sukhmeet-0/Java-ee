interface A{
    void show();
}
public class LambdaExpression {
    public static void main(String[] args) {
        A a=()->{
            System.out.println("show");
        };


        // A a=new A() {
        //     public void show(){
        //         System.out.println("Hello");
        //     }
        // };
        a.show(); 
    }
}
