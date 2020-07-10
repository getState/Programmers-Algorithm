import java.util.Arrays;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, false);
        for(int i = 2 ; i<=(n/2) ; i++){
            for(int j = 2 ; j<=(n/i) ; j++){
                arr[i*j] = true;
            }
        }
        for(int i = 2 ; i<n+1 ; i++){
            if(arr[i]==false){
                answer++;
            }
        }
        return answer;
    }
}