import java.lang.StringBuilder;
class Solution {
    public String solution(String phone_number) {
        String answer;
        StringBuilder answerSB = new StringBuilder();
        for(int i = 0 ; i<phone_number.length()-4 ; i++){
            answerSB.append('*');
        }
        for(int i = phone_number.length()-4 ; i<phone_number.length() ; i++){
            answerSB.append(phone_number.charAt(i));
        }
        answer = answerSB.toString();
        return answer;
    }
}