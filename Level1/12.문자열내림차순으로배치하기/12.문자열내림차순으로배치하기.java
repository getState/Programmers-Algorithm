import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        StringBuilder answerSB = new StringBuilder(s);
        for(int i = 0; i<answerSB.length(); i++){
            for(int j = i+1 ; j<answerSB.length() ; j++){
                if(answerSB.charAt(i)<answerSB.charAt(j)){
                    char temp = answerSB.charAt(i);
                    answerSB.setCharAt(i, answerSB.charAt(j));
                    answerSB.setCharAt(j, temp);
                }
            }
        }
        String answer =answerSB.toString();
        return answer;
    }
}