package _27_Interface;

public class AnimalManager {

    // AnimalManager 클래스의 makeSound의 의존성 : Animal 인터페이스
    // Dog 클래스의 의존성 : Animal... : AnimalManager를 의존 X
    // Duck 클래스의 의존성 : Animal... : AnimalManager를 의존 X
    // 의존성 방향 [Dog] -> [Animal] <- [AnimalManager]
    // -> 구체적은 클래스끼리 의존하는 게 아니라 인터페이스를 통해 작동
    // -> 결합도가 낮다.
    // 이상적인 구조! (구현체 모두가 추상체를 의존하는 구조!)
    // DIP - 의존성 역전의 원칙

    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void makeFlying(Flyable flyable) {
        flyable.fly();
    }

    public void makeSwimming(Swimmable swimmable) {
        swimmable.swim();
    }



}
