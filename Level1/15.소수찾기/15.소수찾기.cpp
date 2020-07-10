#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<bool> arr(n+1, false);
    for(int i =2 ; i<=(n/2); i++){
        for(int j = 2; j<=(n/i); j++){
            arr[i*j] = true;
        }
    }
    for(int i = 2 ; i<n+1; i++){
        if(arr[i]==false){
            answer++;
        }
    }
    return answer;
}