#include <iostream>
#include <string>
using namespace std;
int go(string str,int i,int j,int n){
    int res=0;
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else{
        
        res=go(str,i+1,j,n-1)+
            go(str,i,j-1,n-1)-
            go(str,i+1,j-1,n-2);
        if(str[i]==str[j]){
            res++;
        }
    }
    return res;
}
int main(){
    string str;
    cin>>str;
    cout<<go(str,0,str.length()-1,str.length());

}