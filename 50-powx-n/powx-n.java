class Solution {
    public double myPow(double x, int n) {

        long binform = n;

        if (binform < 0) {
            binform = -binform;
        }

        double ans = 1.0;

        while (binform > 0) {

            if (binform % 2 == 1) {
                ans *= x;
            }

            x *= x;
            binform /= 2;
        }

        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}