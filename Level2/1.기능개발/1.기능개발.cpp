#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    int maxNum = 0;
    int count = 0;
    for(int i = 0 ; i<progresses.size() ; i++){
        int days = 0;
        
        if((100-progresses[i])%speeds[i]==0){
            days = (100-progresses[i])/speeds[i];
        }else{
            days = (100-progresses[i])/speeds[i] +1;
        }
        
        if(i==0){
            maxNum = days;
        }
        
        count++;
        if(days>maxNum){
            answer.push_back(count-1);
            maxNum = days;
            count = 1;
        }
    }
    answer.push_back(count);
    return answer;
}