#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> adj[100005];
bool visited[100005];
long nodes;

void DFS(int n)
{
    nodes++;
    visited[n] = true;
    for(vector<int>::iterator i = adj[n].begin(); i != adj[n].end() ; i++)
    {
        if(!visited[*i])
            DFS(*i);
    }
}


int main()
{
    int T;
    cin >> T;
    while(T--)
    {
        int N,M,a,b;
        long clib,croad;
        cin >> N >> M >> clib >> croad;

        for(int i = 0 ; i < M ; i++)//graph representation
        {
            cin >> a >> b;
            adj[a].push_back(b);
            adj[b].push_back(a);
        }

        long cost=0;

        for(int i = 1 ; i <= N ; i++)
        {
            if(!visited[i])
            {
                nodes = 0;
                DFS(i);
                if(clib > croad)
                    cost = cost + (croad*(nodes-1))+clib;
                else
                    cost = cost + (clib*(nodes));
            }
        }

        cout << cost << endl;
        for(int i=0 ; i<=N ; i++)//clear graph and visited for next test case
        {
            adj[i].clear();
            visited[i] = false;
        }
    }

    return 0;
}
