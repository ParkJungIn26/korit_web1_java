package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice01 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("리모콘", 1, false, 60000)
        );

        // Item 객체들에서 이름들만 뽑아내기
        List<String> itemNames = items.stream()
                .map(item -> item.getName())
                .collect(Collectors.toList());
        System.out.println(itemNames);
        
        // stream에서는 외부변수 사용이 제한 (final 사용 가능)
        // 누적합 :  reduce 최종연산자를 사용해야 함
        // 1. 가격들만 뽑아서 평균 가격을 출력
        int AvgPrice = 0;
        
        // 2. 재고들의 총 가격 출력 (리턴 x -> forEach)
        items.stream()
                .forEach(item -> {
                    int stock = item.getStock();
                    int price = item.getPrice();
                    System.out.println(stock * price);
                });

        // 3. 재고가 1개 이상이면서 세일 중인 items들 List로 콜렉팅 (collect)
        List<Item> filteredItems = items.stream()
                .filter(item -> item.getstock() > 0)
                .filter(item -> item.isOnSale()
                        .collect(Collectors.toList());

        System.out.println(filteredItems);



    }
}
