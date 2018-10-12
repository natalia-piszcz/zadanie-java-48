public class Number {
    int nr;


    public Number(int nr) {
        this.nr = nr;
    }

    public int sumCalculate () {
        int sum =0;
        while (nr != 0) {
            sum +=  nr % 10;
            nr/=10;
        }
        return sum;
    }


}
