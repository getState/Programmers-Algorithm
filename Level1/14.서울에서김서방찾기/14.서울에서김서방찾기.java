import java.lang.StringBuilder;
class Solution {
    public String solution(String[] seoul) {
        StringBuilder answerSB = new StringBuilder();
        for(int i = 0 ; i<seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                answerSB.append("김서방은 ");
                answerSB.append(Integer.toString(i));
                answerSB.append("에 있다");
                break;
            }
        }
        String answer = answerSB.toString();
        return answer;
    }
}