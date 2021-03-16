#include <iostream>
using namespace std;

int main(){
    int sumOfSeconds = 0, minutes, seconds;
    
    for(int i = 0; i < 4; i++){
        int input; cin >> input;
        sumOfSeconds += input;
    }
    
    seconds = sumOfSeconds % 60;
    minutes = sumOfSeconds / 60;
    
    cout << minutes << '\n' << seconds;
}
