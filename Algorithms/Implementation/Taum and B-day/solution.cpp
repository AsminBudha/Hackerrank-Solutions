#include <iostream>
#include <stdio.h>
#include <algorithm>
#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
int main(){
	//freopen("input.txt","r",stdin);
	int T;
	cin>>T;
	ll b,w,x,y,z,ans;
	while(T-->0){
		cin>>b>>w>>x>>y>>z;
		if(x<y){
			ans=(x*b)+(y<(x+z)?y*w:(x+z)*w);

		}
		else{
			ans=(y*w)+(x<(y+z)?x*b:(y+z)*b);
		}
		cout<<ans<<"\n";
	}
	return 0;
}
