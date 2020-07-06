class Solution {
    public String solution(String s) {
        String answer = "";
        int stringLength = s.length();
        if(stringLength%2==1){
            answer += s.charAt(stringLength/2);
        }else{
            int start = (stringLength/2)-1;
            int end = stringLength/2;
            answer = s.substring(start, end+1);
        }
        return answer;
    }
}