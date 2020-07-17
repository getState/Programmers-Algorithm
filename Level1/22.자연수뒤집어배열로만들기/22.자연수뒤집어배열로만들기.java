import java.util.ArrayList;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        while(n>0){
            answerAL.add((int)(n%10));
            n = n/10;
        }
        int[] answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i);
        }
        return answer;
    }
}