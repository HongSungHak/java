abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("여기서 멈춥니다.");
    }
}
interface Fighterable { // 인터페이스의 모든 메서드는 public abstract. 예외없이
    void move(int x, int y); //public abstract가 생략됨.
    void attack(Fighterable f); //public abstract가 생략됨.
}
class Fighter extends Unit implements Fighterable{
    // 오버라이딩 규칙: 조상(public) 제어자보다 접근 제어자가 좁으면 안된다.
        public void move(int x, int y) {
         System.out.println("["+x+","+y+"]로 이동");
        }
        public void attack(Fighterable f) {
            System.out.println(f+"를 공격");
        }
        Fighterable getFighterable(){ // 파이터를 생성해서 반환
        Fighter f = new Fighter();
        return f;
        }
}


public class FighterTest {
    public static void main(String[] args) {
            Fighter f = new Fighter();
            Fighterable f2 = f.getFighterable();
        }
    }

