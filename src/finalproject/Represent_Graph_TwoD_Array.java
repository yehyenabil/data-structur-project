
package finalproject;

public class Represent_Graph_TwoD_Array {
        private final int vertices;
    private int[][] twoD_array;
 public Represent_Graph_TwoD_Array(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];

    }
public void makeEdge(int to, int from, int edge) {
        try {
twoD_array[to][from] = edge;

        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("The vertices does not exists");

        }

    }
public int getEdge(int to, int from){
 
            return twoD_array[to][from];

    }

}

