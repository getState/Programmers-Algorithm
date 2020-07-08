#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    for(int i = 0 ; i<strings.size() ; i++){
        for(int j = i+1 ; j<strings.size() ; j++){
            if(strings[i][n]>strings[j][n]){
                string temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }else if(strings[i][n]==strings[j][n] && strings[i]>strings[j]){
                string temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }
        }
        answer.push_back(strings[i]);
    }
    return answer;
}