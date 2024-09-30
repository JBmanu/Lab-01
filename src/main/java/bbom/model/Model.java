package bbom.model;

public interface Model<T> {

    T state();

    void increaseState();
}
