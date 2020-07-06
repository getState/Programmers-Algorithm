#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int stringLength = s.size();
    if(stringLength%2==1){
        answer = s[stringLength/2];
    }else{
        answer = s[(stringLength/2)-1];
        answer += s[stringLength/2];
    }
    return answer;
}