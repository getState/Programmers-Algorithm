#include <string>
#include <vector>
#include <algorithm>
using namespace std;

long long solution(long long n) {
    long long answer = 0;
    int count = 1;
    while(true){
        long long temp = pow(count, 2);
        if(n<temp){
            return -1;
        }else if(n==temp){
            answer = pow(count+1, 2);
            break;
        }else{
            count++;
            continue;
        }
    }
    return answer;
}