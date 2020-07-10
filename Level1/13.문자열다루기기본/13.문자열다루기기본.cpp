#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    if(s.size()==4 || s.size()==6){
        answer = true;
    }else{
        return false;
    }
    for(int i = 0 ; i<s.size() ; i++){
        if(s[i]<'0' || s[i]>'9'){
            answer = false;
            break;
        }
    }
    return answer;
}