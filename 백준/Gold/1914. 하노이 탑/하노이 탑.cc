#include <bits/stdc++.h>

using namespace std;

void hanoi(int start, int aux, int dest, int n){
    if(n < 1){
        return;
    }
        hanoi(start, dest, aux, n-1);
        cout << start << " " << dest << '\n';
        hanoi(aux, start, dest, n-1);
        return;
}

int main(){
    int n;
    cin >> n;

    string res = to_string(pow(2, n));
    res = res.substr(0, res.find('.'));
    res[res.length()-1] -= 1;

    if(n <= 20){
        cout << res << '\n';
        hanoi(1,2,3,n);
    }else{
        cout << res << '\n';
    }
}