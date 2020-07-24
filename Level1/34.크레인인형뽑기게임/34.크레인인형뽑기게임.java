import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0 ; i<moves.length ; i++){
            int element = moves[i]-1;
            for(int j = 0 ; j<board.length ; j++){
                if(board[j][element]>0){
                    if(!stk.empty() && stk.peek()==board[j][element]){
                        stk.pop();
                        board[j][element] = 0;
                        answer += 2;
                    }else{
                        stk.push(board[j][element]);
                        board[j][element] = 0;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}