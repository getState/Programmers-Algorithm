import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i<commands.length ; i++){
            int sliceStart = commands[i][0];
            int sliceEnd = commands[i][1];
            int findIndex = commands[i][2];
            int[] temp = Arrays.copyOfRange(array, sliceStart-1, sliceEnd);
            Arrays.sort(temp);
            answer[i] = temp[findIndex-1];
        }
        return answer;
    }
}