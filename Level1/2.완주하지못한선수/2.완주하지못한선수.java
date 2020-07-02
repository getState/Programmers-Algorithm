import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashParticipant = new HashMap<String, Integer>();
        for(String element : participant){
            if( hashParticipant.containsKey(element) ){
                int num = hashParticipant.get(element);
                hashParticipant.put(element, num+1);
            }else{
                hashParticipant.put(element, 1);
            }
        }
        for(String element : completion){
            int num = hashParticipant.get(element);
            if( num == 1){
                hashParticipant.remove(element);
            }else{
                hashParticipant.put(element, num-1);
            }
        }
        for ( String key : hashParticipant.keySet() ) {
          answer = key;
        }
        return answer;
    }
}