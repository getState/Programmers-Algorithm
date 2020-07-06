#include <string>
#include <vector>
#include <map>
using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
//  map< 이름, 인원수 >
//  사전에 담는 부분
    map<string, int> hashParticipant;
    for(auto element : participant){
        if( hashParticipant.find(element) == hashParticipant.end() ){
            hashParticipant.insert(make_pair(element,1));
        }else{
            hashParticipant[element]++;
        }
    }
    
// 완주한 사람들 확인하는 부분
    for(auto element : completion){
        
        if( hashParticipant[element] ==1 ){
            hashParticipant.erase( hashParticipant.find(element) );
        }else{
            hashParticipant[element]--;
        }
    }
    answer = hashParticipant.begin()->first;
    return answer;
}