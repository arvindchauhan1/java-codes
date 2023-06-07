class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

}

public class GenericClasses {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getClass());
        System.out.println(intBox.getItem());
    }
}