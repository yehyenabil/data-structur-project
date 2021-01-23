/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author pody
 */
public class MinimumSpanningTree {
public static int ID[];
public  static int RANK[];
        
        public static boolean union(int i, int j) {
            
            if(i==j)
            { 
               return true;
            }
            int p1=root(i);
            int p2=root(j);
            if(p1==p2)
            {
                return false;
            }
            if(RANK[p1]<RANK[p2]) {
                int temp=p1;
                p1=p2;
                p2=temp;
            }      
            ID[p2]=p1;
            if(RANK[p1]==RANK[p2]) {
                RANK[p1]++;
            }
            return true;
        }
        public static int root(int i) {
            while(i!=ID[i])
                i=ID[i];
            return i;
        }
        public static int getCon() {
            int c=0;
            for(int i=1;i<ID.length;++i) {
                if(ID[i]==i)
                    c++;
            }
            return c;
        }
    
}
