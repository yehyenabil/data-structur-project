
package finalproject;
import java.util.Stack;

public class DigraphTopologicalSortingDFS {
       public static int same=0;
       public static int w=0;
      public static int[] numofpath;
 public DigraphTopologicalSortingDFS(){
     
    }
    public int[] topological(int adjacency_matrix[][], int source){
        int number_of_nodes = adjacency_matrix[source].length - 1;
stack s=new stack(number_of_nodes+1);
        int[] topological_sort = new int[number_of_nodes + 1];
       numofpath=new int[number_of_nodes+1];

        int pos = 0;

        int j;

        int visited[] = new int[number_of_nodes + 1];

        int element = source;
        int i = source;
        visited[source] = 1;

        s.push(source);

        while (!s.isEmpty()){

            element = s.peek();

            while (i <= number_of_nodes){
                if (adjacency_matrix[element][i] == 1 && visited[i] == 1)  {
                    numofpath[i]++;

                    if (s.contains(i)){

                        System.out.println("TOPOLOGICAL SORT NOT POSSIBLE");

                        return null;

                    }

                }

                if (adjacency_matrix[element][i] == 1 && visited[i] == 0)

                {

                    s.push(i);

                    visited[i] = 1;

                    element = i;

                    i = 1;

                    continue;

                }
                i++;
            }
            if(s.top>=same){
                 w++;
                 same=s.top;
            }

            j = s.pop();

            topological_sort[pos++] = j;

            i = ++j;

        }
        return topological_sort;   
}
}
