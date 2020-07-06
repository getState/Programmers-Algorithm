class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = 1;
        }
        for(int i = 0 ; i<lost.length ; i++){
            int element = lost[i];
            arr[element]--;
        }
        for(int i = 0 ; i<reserve.length ; i++){
            int element = reserve[i];
            arr[element]++;
        }
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i-1]==0 && arr[i]==2){
                arr[i-1]++;
                arr[i]--;
            }
            if(i<n && arr[i+1]==0 && arr[i]==2){
                arr[i+1]++;
                arr[i]--;
            }
        }
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>0){
                answer++;
            }
        }
        return answer;
    }
}