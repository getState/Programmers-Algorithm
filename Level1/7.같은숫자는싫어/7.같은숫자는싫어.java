import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        int nowNumber = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=nowNumber){
                nowNumber = arr[i];
                answerAL.add(arr[i]);
            }
        }
        int[] answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i).intValue();
        }
        

        return answer;
    }
}