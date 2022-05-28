package problem;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        if(num < 2) return num;

        int res = 0;
        while (num != 0){
            res += num%2 == 0? 1: 2;
            num /= 2;
        }

        return res-1;
    }
}
