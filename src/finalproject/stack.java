
package finalproject;

public class stack {
    public int size ;
    int top=-1;
    int arr[];
    stack (int size) {
  this.size = size;
  top = -1;
   arr = new int[size];
}
 public boolean isEmpty () {
if (top == -1)
return true ;
else
return false ;
}   
    public void push(int data){
        top++;
        arr[top]=data;
}
     int pop(){ 
        int x = arr[top];
            arr[top]=0;
            top--;
            return x; 
        }
    public int peek(){
     
        return arr[top];
        
    }
 public boolean contains(int num){
     for(int i=0;i<size;i++){
         if(arr[i]==num)
            return true;
         
     }
        return false;
 }   
   
}
