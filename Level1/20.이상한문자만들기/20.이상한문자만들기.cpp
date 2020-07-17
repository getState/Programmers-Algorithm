#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int oddOrEven = 0;
    for(int i = 0 ; i<s.size() ; i++){
        if(s[i]==' '){
            answer+=' ';
            oddOrEven=0;
        }else if(oddOrEven%2==0){
            answer+=toupper(s[i]);
            oddOrEven++;
        }else{
            answer+=tolower(s[i]);
            oddOrEven++;
        }
    }
    return answer;
}