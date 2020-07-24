import java.util.ArrayList;
class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answerAL = new ArrayList<Long>();
        for(int i = 1 ; i<=n ; i++){
            answerAL.add((long)x*i);
        }
        long[] answer = new long[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i);
        }
        return answer;
    }
}