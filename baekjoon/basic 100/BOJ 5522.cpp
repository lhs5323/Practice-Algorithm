#include <iostream>
using namespace std;

int main(){
    int n = 5, sum = 0, input;
    
    while(n-- > 0){
        cin >> input;
        sum += input;
    }
    
    cout << sum;
}
