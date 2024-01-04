public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.startValue = this.value() + 1;
    }

    public void decrease() {
        this.startValue = this.value() - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.startValue = this.value() + increaseBy;
        } else {
            this.startValue = this.value();
        }
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            this.startValue = this.value() - decreaseBy;
        }else{
            this.startValue = this.value();
        }
    }
}