package _36_Lambda;

@FunctionalInterface
public interface Modifier<I extends Number, S> {
    Person modify(int person);

}
