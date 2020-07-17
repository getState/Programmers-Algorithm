import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n>0){
            arr.add((int)(n%10));
            n = n/10;
        }
        Collections.sort(arr);
        for(int i = 0 ; i<arr.size() ; i++){
            answer += Math.pow(10,i) * arr.get(i);
        }
        return answer;
    }
}