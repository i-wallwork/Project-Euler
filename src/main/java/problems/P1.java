package problems;

public class P1 {

    int first;
    int second;

    public P1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int result() {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%first==0 || i%second==0) {
                result += i;
            }
        }
        return result;
    }
}
