import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        for(int i = 0 ; i<arr.length ; i++){
            answerAL.add(arr[i]);
        }
        int minNum = Collections.min(answerAL);
        answerAL.remove(answerAL.indexOf(minNum));
        if(answerAL.size()==0){
            answerAL.add(-1);
        }
        int[] answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i);
        }
        return answer;
    }
}