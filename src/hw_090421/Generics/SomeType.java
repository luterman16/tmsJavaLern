package hw_090421.Generics;

public class SomeType<T> {
    T[] array;

    public SomeType(T[] array) {
        this.array = array;
    }

    public <T> T getElement (int index) {
        return (T)array[index];
    };

}
