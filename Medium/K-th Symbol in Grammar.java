class Solution {
    public int kthGrammar(int N, int K) {
        if (Integer.bitCount(K - 1) % 2 == 0) return 0;
        else return 1;
    }
}
