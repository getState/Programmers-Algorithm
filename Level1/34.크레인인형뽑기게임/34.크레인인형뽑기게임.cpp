#include <string>
#include <vector>
#include <stack>
using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    stack<int> stk;
    for(auto element:moves){
        element = element-1;
        for(int i = 0 ; i<board.size() ; i++){
            if(board[i][element]>0){
                if(!stk.empty() && stk.top()==board[i][element]){
                    stk.pop();
                    board[i][element] = 0;
                    answer += 2;
                }else{
                    stk.push(board[i][element]);
                    board[i][element] = 0;
                }
                break;
            }
        }
    }
    return answer;
}