/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpathdijkstras;

/**
 *
 * @author HP
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestPathDijkstras {

    /**
     * @param args the command line arguments
     */
    
    static int V=5;
int minDistance(int dist[],Boolean sptSet[]){
int min=Integer.MAX_VALUE,min_index=-1;
for(int v=0;v<V;v++)
if(sptSet[v]==false && dist[v]<=min){
min= dist[v];
min_index=v;
            }
return min_index;
    }
void printSolution(int dist[],int n){
System.out.println("Vertex\t\tDistance from Source");
for(int i=0;i<V;i++)
System.out.println(i+"\t\t\t"+dist[i]);
    }
void dijkstra(int graph[][],int src)
    {
int dist[]=new int[V];
    Boolean sptSet[]=new Boolean[V];
for(int i=0;i<V;i++){
dist[i]=Integer.MAX_VALUE;
sptSet[i]=false;
    }
dist[src]=0;
for(int count=0;count<V-1;count++){
int u=minDistance(dist,sptSet);
sptSet[u]=true;

for(int v=0;v<V;v++){
        if(!sptSet[v]&& graph[u][v]!=0 &&dist[u]!=Integer.MAX_VALUE&&dist[u]+graph[u][v]<dist[v]){
dist[v]=dist[u]+graph[u][v];
        }
    }
printSolution(dist,V);
    }}
public static void main(String[]args)
{
    Scanner scan=new Scanner(System.in);
int vertices;
int[][] graph;
System.out.println("####### Dijktras Algorithm #######");
    V=scan.nextInt();
graph=new int[V][V];
System.out.println("Enter the distance of each vertex:");
for (int i=0;i<V;i++){
for(int j=0;j<V;j++)
        {
graph[i][j]=scan.nextInt();
        }
    }
ShortestPathDijkstras obj1=new ShortestPathDijkstras();
obj1.dijkstra(graph, 0);
}
}




