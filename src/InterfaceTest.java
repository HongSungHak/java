class A{
    public void method(I i) {
        i.method();
    }
}
interface I {
    public void method();

}
// B클래스의 선언과 구현을 분리
class B implements I{
    public void method(){
        System.out.println("B클래스 메서드");
    }
}
class C implements I{
    public void method(){
        System.out.println("C 클래스 메서드");
    }
}



public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();

        a.method(new C());
    }
}
