package _38_Stream;

import lombok.Data;

import java.util.stream.DoubleStream;

@Data
// toString, equals, hashcode,
// getter, setter, RequiredArgConstructor (final 붙은 필드만 초기화하는 생성자)
@AllArgsConstructor // 필드 전체 초기화하는 생성자
public class Item {
    private String name; // 상품이름
    private int stock; // 재고량
    boolean isOnSale; // 할인여부
    private int price; // 상품가격

    public Item(String name, int stock, boolean isOnSale, int price) {
    }

    public Object getName() {
    }

    public int getStock() {
    }

    public int getPrice() {
    }

    public int getstock() {
    }

    public DoubleStream isOnSale() {
    }
}
