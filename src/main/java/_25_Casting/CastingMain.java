package _25_Casting;

import _24_Inheritance.Car.Car;
import _24_Inheritance.Car.ElectricCar;
import _24_Inheritance.Car.GasCar;

public class CastingMain {
    public static void main(String[] args) {
        // 캐스팅? 타입을 변경하는 것
        // 상속에서의 캐스팅
        // 1. 업캐스팅 : 자식클래스 -> 부모클래스 타입으로 변경
        // 2. 다운캐스팅 : 부모클래스 -> 자식클래스 타입으로 변경

        // 업캐스팅
        // new로 만들어진 건 ? 자식클래스
        // 변수타입 ? 부모클래스
        Car car1 = new ElectricCar("현대");
        Car car2 = new GasCar("르노");
        
        //car1.charge(); 업캐스팅 되었기 때문에 ECar의 메서드 호출 불가

        // 다운캐스팅
        ElectricCar eCar = (ElectricCar) car1;
        eCar.charge();

        // 컴파일러 / JVM을 구분해서 생각해야 함
        // 객체 초기화에서 "=" 기준 좌변은 컴파일러, 우변은 JVM
        // 컴파일러는 변수타입만 고려해서 코드 해석함
        // JVM은 실제 메모리에 올라간 것만 고려해서 작동함
        // Car car1 = new ElectricCar("현대");

        // 다운캐스팅 주의사항!
        // 런타임 오류가 발생할 수 있음
        // 컴파일러는 Car -> ElectricCar로 다운캐스팅 용인(타입만 고려)
        // JVM 입장에서는 heap에 [battery | model] 초기화를 해야 하는데,
        // car2는 battery 필드가 존재하지 않음
        // ElectricCar eCar2 = (ElectricCar) car2;

        // instanceof 연산자
        System.out.println(car2 instanceof ElectricCar);

        // 안전한 다운캐스팅
        if(car2 instanceof ElectricCar) {
            ElectricCar eCar2 = (ElectricCar) car2;
        } else if (car2 instanceof GasCar) {
            GasCar gCar = (GasCar) car2;
        }

        Car tesla = new ElectricCar("모델S"); // 업캐스팅
        // instanceof 작동원리 : 왼쪽 객체가 오른쪽 타입에 대입할 수 있는가
        System.out.println(tesla instanceof ElectricCar);
        System.out.println(tesla instanceof GasCar);
        System.out.println(tesla instanceof Car); // true

    }
}
