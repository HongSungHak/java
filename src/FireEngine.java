class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, brrrrr~");
    }
    void stop() {
        System.out.println("멈춤");
    }
}
class FireEngineCar extends Car {
    void water() {
        System.out.println("water!");
    }
}

class Ambulance extends Car {

}




public class FireEngine {
    public static void main(String[] args) {
        FireEngineCar f = new FireEngineCar();

        Car c = f;
        FireEngineCar f2 = (FireEngineCar)c;
//        Ambulance a = (Ambulance)f2; //부모 자손 관계만 다형성의 형변환이 가능함

    }
}
