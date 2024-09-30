package bbom.model;

public class ModelImpl implements Model<Integer> {
    private int state;

    public ModelImpl() {
        this.state = 0;
    }

    @Override
    public Integer state() {
        return this.state;
    }

    @Override
    public void increaseState() {
        this.state++;
    }
}
