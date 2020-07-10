import java.lang.StringBuilder;
class Solution {
    public String solution(int n) {
        StringBuilder answerAL = new StringBuilder();
        while(n!=0){
            if(n%3==0){
                answerAL.append("4");
            }else if(n%3==1){
                answerAL.append("1");
            }else{
                answerAL.append("2");
            }
            n = (n-1)/3;
        }
        answerAL.reverse();
        String answer = answerAL.toString();
        return answer;
    }
}