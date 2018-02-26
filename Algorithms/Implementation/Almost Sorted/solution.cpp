#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <cstdlib>
#include <cassert>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    scanf("%d",&n);
    vector<int> arr(n);
    for (int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    
    vector<int> sorted(n);
    for (int i=0;i<n;i++){
        sorted[i]=arr[i];
    }
    sort(sorted.begin(),sorted.end());
    vector<int> diff;
    for (int i=0;i<n;i++){
        if (sorted[i]!=arr[i]){
            diff.push_back(i);
        }
    }
        
    if (diff.size()==0){
        printf("yes\n");
    }else if (diff.size()==2){
        printf("yes\nswap %d %d\n",diff[0]+1,diff[1]+1); //Index starts at 1!!!
    }else{//Let's try reverse it!
        int st = diff[0], ed = diff[diff.size()-1];
        while (st<ed){
            swap(arr[st],arr[ed]);
            st++;
            ed--;
        }
        for (int i=0;i<n;i++){
            if (sorted[i]!=arr[i]){
                printf("no\n");  
                return 0;
            }
        }
        printf("yes\nreverse %d %d\n",diff[0]+1,diff[diff.size()-1]+1); //Index starts at 1!!!
    }
}
