
package finalproject;
import java.util.Scanner;
import java.util.*;
        
public class Finalproject {   
public static float myratio;
public static int con00;
   public static void main(String[] args)throws Exception {
   Scanner sc = new Scanner(System.in);
        


   // implement hashing
       int num1;
 System.out.println("enter the word");
 String word=sc.nextLine();
        HashTableChainingSinglyLinkedList htcsll = new HashTableChainingSinglyLinkedList(word );        
        for(int i=0;i<word.length();i++){
            num1=(int)word.charAt(i);
            htcsll.insert(num1);  
        }
int max=htcsll.mixoccer();
System.out.print((char)(htcsll.index));
System.out.println( " "+htcsll.max);



//MinimumSpanningTree mi=new MinimumSpanningTree();
//   int n=sc.nextInt();
//            int m=sc.nextInt();
//            int a[][]=new int[m][3];
//            for(int i=0;i<m;++i) {
//                a[i][1]=sc.nextInt();
//                a[i][2]=sc.nextInt();
//                a[i][0]=Math.abs(a[i][1]-a[i][2]);
//            }
//            Arrays.sort(a,(b,c)->c[0]-b[0]);
//
//            mi.ID=new int[n+1];   
//    
//               mi.RANK=new int[n+1];
//            for(int i=0;i<n;++i)
//               mi.ID[i]=i;
//            int cost=0;
//            for(int i[]:a) {
//                int u=i[1];
//                int v=i[2];
//                boolean c=mi.union(u,v);
//                if(!c) 
//                    cost+=i[0];
//            }
//            cost+=mi.getCon()-1;
//            System.out.println("The minimum cost"+"   "+ cost);













   
   boolean x=true;
int chois = 0;





while(x==true){

System.out.println("enter (0) to solve second  problem");
System.out.println("enter (1) to solve therd problem");
chois = sc.nextInt();
switch(chois){
        
case 0 :    
     BST theTree = new BST();
     int num0=0;
     System.out.println("enter ratio");
     float ratio=sc.nextFloat();
     System.out.println("enter numbers and If you want to force the program to terminate  you can input -1 ");
for(float i=1;i<Integer.MAX_VALUE;i++){ 
    num0=sc.nextInt();
    if(num0==-1){
        System.out.println("only few repetitions and ratio equal  "+myratio);
        break ;
    }
    theTree.addNode(num0);
    myratio=((i)/(BST.conuter));
    if(myratio>=ratio){
     System.out.println("many repetitions and ratio equal "+myratio);
         break ;    
   }
   
} 
    break;            
case 1:     
int v, e, count = 1, to = 0, from = 0;
       
        Represent_Graph_TwoD_Array graph;

        
            v = sc.nextInt();
int adjacency_matrix[][] = new int[v + 1][v + 1];
            e = sc.nextInt();
           int source = sc.nextInt();       
 graph = new Represent_Graph_TwoD_Array(v);
 System.out.println("Enter the edges: <to> <from>");

         while (count <= e){
   to = sc.nextInt();
 from = sc.nextInt();
 graph.makeEdge(to, from, 1);
 count++;
 }
            for (int i = 0; i <= v; i++)  {
                for (int j = 0; j <= v; j++) 
adjacency_matrix[i][j]=graph.getEdge(i, j);

            }
 int topological_sort[] = null;
            System.out.println("The Topological sort for the graph is given by ");

            DigraphTopologicalSortingDFS toposort = new DigraphTopologicalSortingDFS();

            topological_sort = toposort.topological(adjacency_matrix, source);
int temp=0,con=0,max0=0;
int []sortanswer=new int[toposort.w];
            for (int i = 0; i < toposort.w; i++){

                if (topological_sort[i] != 0){
                   if(toposort.numofpath[topological_sort[i]]>=temp){                      
                        sortanswer[con]=topological_sort[i];
                        con++;
                        temp=toposort.numofpath[topological_sort[i]];
                   }
                    else;
                     continue ;
                }
            }
            int max1;
            for(int j=0;j<con;j++){
               max1= sortanswer[j];
               for(int w=j+1;w<con;w++){
                   if(sortanswer[w]>max1)
                       max1=sortanswer[w];
               }
               System.out.println(max1 +" ");
            }

 break ;   
 }

System.out.println("****************************************************************************************************");           
System.out.println("if you want anther chois enter (0) and(1) if you wont to close from the program ");
 con00 = sc.nextInt();
if (con00!=0)
x=false;	

}
    }
 }
