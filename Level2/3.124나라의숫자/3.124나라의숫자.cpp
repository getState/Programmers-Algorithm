#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(int n) {
    string answer = "";
    while(n!=0){
        if(n%3==0){
            answer +="4";
        }else if(n%3==1){
            answer +="1";
        }else{
            answer +="2";
        }
        n = (n-1)/3;
    }
    reverse(answer.begin(), answer.end());
    return answer;
}