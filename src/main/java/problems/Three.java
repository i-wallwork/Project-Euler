package problems;

import java.util.Stack;

public class Three {
    public Long result(long  i) {
        Stack<Long> stack = new Stack<>();

        for (long j = 2; j <= i; j++) {
            if (i % j == 0) {
                stack.push(j);
            }
        }
        return stack.pop();
    }
}
