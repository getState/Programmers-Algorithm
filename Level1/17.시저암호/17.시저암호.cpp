#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string s, int n) {
    string answer = "";
    for(int i = 0 ; i<s.size() ; i++){
        char element = s[i];
        if(element == ' '){
            continue;
        }else if(element>='a' && element<='z'){
            element += n;
            s[i] = tolower(element);

        }else{
            element += n;
            s[i] = toupper(element);
        }
    }
    answer = s;
    return answer;
}