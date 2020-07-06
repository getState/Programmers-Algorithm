#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int person1[5] = {1, 2, 3, 4, 5};
    int person2[8] = {2, 1, 2, 3, 2, 4, 2, 5};
    int person3[10] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    vector<int> result = {0, 0, 0}; 
    for(int i = 0; i<answers.size() ; i++){
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
    int maxResult = max(result[0], result[1]);
    maxResult = max(maxResult, result[2]);
    for(int i = 0 ; i<result.size() ; i++){
        if(result[i] == maxResult){
            answer.push_back(i+1);
        }
    }
    
    return answer;
}