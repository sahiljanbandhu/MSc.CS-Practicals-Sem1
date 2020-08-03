/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krushkal;

import java.util.*;
/**
 *
 * @author HP
 */
public class Krushkal {

    /**
     * @param args the command line arguments
     */
    
    
      public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    public static int i,j,k,a,b,u,v,n,ne=1;
    public static int min,mincost=0;
    public static int[][]cost=new int[20][20];
    public static int[] parent=new int[20];
    public static void main(String[]args)
    {
        System.out.println("\n\t implementation of krushkal's algorithm");
        System.out.println("\n Enter the no. of vertices:");
        n=STDIN_SCANNER.nextInt();
        System.out.println("\n Enter the cost adjacency matrix:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=STDIN_SCANNER.nextInt();
                if(cost[i][j]==0)
                {
                    cost[i][j]=999;
                }
            }
        }
        System.out.println("the edges of minimum cost spanning tree are");
        while(ne<n)
        {
            min = 999;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                   if(cost[i][j]<min)
                   {
                       min = cost[i][j];
                       a=u=i;
                       b=v=j;
                   }
                }
            }
            if(v!=u)
            {
                parent[v]=u;
                ne++;
                System.out.println("edge("+a+","+b+")="+ min);
                mincost+=min;
            }
            cost[a][b] = (cost[b][a] = 999);
        }
        System.out.println("\n\t minimum cost=" +mincost);
    }
}

    
    
