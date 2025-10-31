package _26_Abstract;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        target.receiveDamage(attackDamage);
        System.out.println(name + "이" + targetName + "에게 관통 화살을 발사합니다!");
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");

    }
}
