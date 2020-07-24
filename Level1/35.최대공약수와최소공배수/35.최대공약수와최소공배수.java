class Solution {
    public int findGcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = findGcd(n, m);
        int lcm = (n*m) / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
}