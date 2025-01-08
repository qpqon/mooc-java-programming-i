
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (this.count != 0) {
            return this.sum;
        }
        return 0;
    }

    public double average() {
        if (this.count != 0) {
            return 1.0 * this.sum / this.count;
        }
        return 0;
    }
}
