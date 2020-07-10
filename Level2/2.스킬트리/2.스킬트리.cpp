#include <string>
#include <vector>

using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    int maxNum = -1;
    for(auto element : skill_trees){
        for(int i = 0 ; i<element.size() ; i++){
            
            if(skill.find(element[i])==string::npos){
                continue;
            }
            int idx = skill.find(element[i]);
            if(idx<maxNum || idx>maxNum+1){
                answer--;
                break;
            }else if(idx==maxNum+1){
                maxNum = idx;
            }
        }
        maxNum = -1;
        answer++;
    }
    return answer;
}