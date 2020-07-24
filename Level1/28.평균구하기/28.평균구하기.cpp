#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    for(auto element:arr){
        answer+=element;
    }
    answer = answer/arr.size();
    return answer;
}