#include <string>
#include <vector>
#include<iostream>
using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    vector<int> arr = vector<int>(n+1,1);
    
    for(auto element : lost){
        arr[element]--;
    }
    for(auto element : reserve){
        arr[element]++;
    }
    for(int i = 1 ; i<n+1 ; i++){
        if(arr[i-1] == 0 && arr[i] == 2){
            arr[i-1]++;
            arr[i]--;
        }
        if(i<n && arr[i+1] == 0 && arr[i] == 2){
            arr[i+1]++;
            arr[i]--;
        }
    }
    for(int i = 1; i<n+1; i++){
        if(arr[i]>0){
            answer++;
        }
    }
    return answer;
}