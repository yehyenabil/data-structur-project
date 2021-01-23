
package finalproject;


public class HashTableChainingSinglyLinkedList {
    private Node1 table[] ;
    private  String tableSize;
    public int max=0;
    public int index=0;
    public HashTableChainingSinglyLinkedList(String tableSize)

    {
        this.tableSize=tableSize;
        table = new Node1[tableSize.length()];
    }
    
public void insert(int val){
        int pos = myhash(val);        
int t=0;
        Node1 nptr = new Node1(val);                
        
        if (table[pos] == null)
            table[pos] = nptr;
             
        
        else {
          for(int i=0;i<tableSize.length();i++){
              if(pos==tableSize.length())
                  pos=0;
             if(table[pos]==null){
                 nptr.next = table[pos];
            table[pos] = nptr;
                 break;
             }
              t=table[pos].data;
            if(t==nptr.data){
            nptr.next = table[pos];
            table[pos] = nptr;
             break;
            }
        else;
             pos++;  
                }
        }
}
    private int myhash(int x ) {

      int  hashVal = x%tableSize.length();

        return hashVal;

    }   
public int mixoccer () {
int num=0,w=0,z=0;

        for (int i = 0; i < tableSize.length(); i++) {
           
            Node1 start = table[i];

            while(start != null) {
                w=(int)table[i].data;
  num++;
  start = start.next;
            }
 if(num==max){
    if(w<index){
      max=num;
    index=w;
    z=i;
    num=0;
    continue ;
    }
}
if(num>max){
    max=num;
    index=w;
    z=i;
    num=0;
    continue ;
}
num=0;

        }
return (z) ;
    }
}
