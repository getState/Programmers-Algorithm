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
            if(element>='a' && element<='z'){
                s[i] = element;
            }else{
                s[i] = 'a' + element - 'z' -1;
            }

        }else{
            element += n;
            if(element>='A' && element<='Z'){
                s[i] = element;
            }else{
                s[i] = 'A' + element - 'Z' -1;
            }
            
        }
    }
    answer = s;
    return answer;
}