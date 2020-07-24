#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0;
    long long longNum = num;
    while(longNum!=1){
        if(longNum%2==0){
            longNum = longNum/2;
            answer++;
        }else{
            longNum = longNum*3 +1;
            answer++;
        }
        if(answer==500&&longNum!=1){
            answer = -1;
            break;
        }
    }
    return answer;
}