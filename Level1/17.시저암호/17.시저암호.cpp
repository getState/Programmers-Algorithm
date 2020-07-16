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
            s[i] = element;
            transform(s.begin()+i,s.begin()+i+1,tolower);
        }else{
            element += n;
            s[i] = element;
            transform(s.begin()+i,s.begin()+i+1,toupper);
        }
    }
    answer = s;
    return answer;
}