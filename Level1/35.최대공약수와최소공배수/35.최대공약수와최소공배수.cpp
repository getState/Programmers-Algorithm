#include <string>
#include <vector>

using namespace std;
int findGcd(int a, int b){
    while(b!=0){
        int temp = a%b;
        a = b;
        b = temp;
    }
    return a;
}
vector<int> solution(int n, int m) {
    vector<int> answer;
    int gcd = findGcd(n, m);
    int lcm = (n*m) / gcd;
    answer.push_back(gcd);
    answer.push_back(lcm);
    
    return answer;
}