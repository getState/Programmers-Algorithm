import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        for(int i = 0 ; i<arr.length ; i++){
            int element = arr[i];
            if(element%divisor==0){
                answerAL.add(element);
            }
        }
        if(answerAL.size()==0){
            answerAL.add(-1);
        }
        Collections.sort(answerAL);
        int[] answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i).intValue();
        }
        return answer;
    }
}