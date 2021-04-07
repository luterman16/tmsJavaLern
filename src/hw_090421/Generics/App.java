package hw_090421.Generics;

public class App {
    public static void main(String[] args) {
        SomeType<Integer> intArray = new SomeType<>(new Integer[]{100,200,300,400,500,600});
        int elem = intArray.getElement(2);
        System.out.println(elem);

        SomeType<String> stringArray = new SomeType<>(new String[]{"Hello", "World"});
        String elem2 = stringArray.getElement(1);
        System.out.println(elem2);
    }
}
