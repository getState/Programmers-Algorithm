class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int count = 0;
        while(x>0){
            count += x%10;
            x = x/10;
        }
        if(temp%count==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}