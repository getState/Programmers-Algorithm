#include <iostream>
#include <string>
#include <vector>
#include<algorithm>

using namespace std;
// 문제시작
vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for(int i = 0 ; i<commands.size() ; i++){
        int sliceStart = commands[i][0];
        int sliceEnd = commands[i][1];
        int findIndex = commands[i][2];
        vector<int> temp = vector<int>(array.begin()+sliceStart-1, array.begin()+sliceEnd);
        sort(temp.begin(),temp.end());
        answer.push_back(temp[findIndex-1]);
    }
    
    return answer;
}
// 문제끝