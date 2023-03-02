package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2 {
    public int evens() {
        int count = 0;
        for (int num : fibonnaci()) {
            if (num %2==0) {
                count += num;
            }
        }
        return count;
    }

    private List<Integer> fibonnaci() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2));
        for (int i = 0; i < 30; i++) {
            int value = result.get(i) + result.get(i + 1);
            result.add(value);
        }
        return result;
    }
}
