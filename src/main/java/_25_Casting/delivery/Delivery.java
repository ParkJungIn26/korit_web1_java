package _25_Casting.delivery;

public abstract class Delivery {
    protected int distance; // 배송거리
    protected int weight; // 수하물 무게

    public Delivery(int distance, int weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public int calcFee() {

        return 3000;
    }

    public void printInfo() {
        int fee = calcFee();
        System.out.println("배송비 : " + fee);

    }

    public abstract int calfFee();
}
