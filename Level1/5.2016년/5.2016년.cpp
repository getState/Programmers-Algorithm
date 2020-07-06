#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    string week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int sumDay[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int count = 0;
    for(int i = 0; i<a-1 ; i++){
        count += sumDay[i];
    }
    count += b-1;
    answer = week[(count+5)%7];
    return answer;
}