class Solution {
    public long solution(long n) {
        long answer = 0;
        int count = 1;
        while(true){
            long temp = (long)Math.pow(count,2);
            if(n<temp){
                return -1;
            }else if(n==temp){
                answer = (long)Math.pow(count+1, 2);
                break;
            }else{
                count++;
                continue;
            }
        }
        return answer;
    }
}