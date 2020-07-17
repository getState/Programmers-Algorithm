import java.lang.StringBuilder;
import java.lang.Character;
class Solution {
    public String solution(String s) {
        StringBuilder answerSB = new StringBuilder();
        int oddOrEven = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)==' '){
                answerSB.append(' ');
                oddOrEven = 0;
            }else if(oddOrEven%2==0){
                answerSB.append(Character.toUpperCase(s.charAt(i)));
                oddOrEven++;
            }else{
                answerSB.append(Character.toLowerCase(s.charAt(i)));
                oddOrEven++;
            }
        }
        String answer = answerSB.toString();
        return answer;
    }
}