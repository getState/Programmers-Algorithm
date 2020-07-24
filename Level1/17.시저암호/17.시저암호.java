import java.lang.StringBuilder;
class Solution {
    public String solution(String s, int n) {
        StringBuilder answerSB = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            char element = s.charAt(i);
            if(element == ' '){
                answerSB.append(' ');
                continue;
            }else if(element>='a' && element<='z'){
                element += n;
                if(element>='a' && element<='z'){
                    answerSB.append(element);
                }else{
                    char temp = (char)('a' + element - 'z' -1);
                    answerSB.append(temp);
                }
            }else{
                element += n;
                if(element>='A' && element<='Z'){
                    answerSB.append(element);
                }else{
                    char temp = (char)('A' + element - 'Z' -1);
                    answerSB.append(temp);
                }
            }
        }
        String answer = answerSB.toString();
        return answer;
    }
}