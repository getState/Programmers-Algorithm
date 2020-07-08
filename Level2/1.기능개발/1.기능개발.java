import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        int maxNum = 0;
        int count = 0;
        for(int i = 0 ; i<progresses.length ; i++){
            int days = 0;
            if((100-progresses[i])%speeds[i]==0){
                days = (100-progresses[i])/speeds[i];
            }else{
                days = (100-progresses[i])/speeds[i] +1;
            }

            if(i==0){
                maxNum = days;
            }

            count++;
            if(days>maxNum){
                answerAL.add(count-1);
                maxNum = days;
                count = 1;
            }
        }
        answerAL.add(count);
        int[] answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i);
        }
        return answer;
    }
}