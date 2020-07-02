import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> answerAL = new ArrayList<Integer>();
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = {0, 0, 0}; 
        for(int i = 0; i<answers.length ; i++){
            int element = answers[i];
            int index1 = i % 5;
            int index2 = i % 8;
            int index3 = i % 10;
            if(person1[index1] == element){
                result[0]++;
            }
            if(person2[index2] == element){
                result[1]++;
            }
            if(person3[index3] == element){
                result[2]++;
            }
        }
        int maxResult = Math.max(result[0], result[1]);
        maxResult = Math.max(maxResult, result[2]);
        for(int i = 0 ; i<result.length ; i++){
            if(result[i] == maxResult){
                answerAL.add(i+1);
            }
        }
        answer = new int[answerAL.size()];
        for(int i = 0 ; i<answerAL.size() ; i++){
            answer[i] = answerAL.get(i).intValue();
        }
        return answer;
    }
}