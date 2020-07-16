import java.lang.StringBuilder;
class Solution {
    public String solution(int n) {
        StringBuilder answerSB = new StringBuilder();
        for(int i = 1 ; i<=n ; i++){
            if(i%2==1){
                answerSB.append('수');
            }else{
                answerSB.append('박');
            }
        }
        String answer = answerSB.toString();
        return answer;
    }
}