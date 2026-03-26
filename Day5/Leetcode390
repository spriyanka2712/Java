class Solution {
    public int lastRemaining(int n) {
    int start = 1;
    int step = 1;
    boolean leftToRight = true;
    while(n > 1){
        if(leftToRight || n%2!=0){
            start += step;
        }
        n /= 2;
        step *= 2;
        leftToRight = !leftToRight;
    }
    return start;
    }
}