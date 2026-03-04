package practice_8.generics;

public class Pair <T,E> {
    private T first;
    private E second;

    public E getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }
}
