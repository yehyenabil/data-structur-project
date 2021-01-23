
package finalproject;
public class BST {
 public static float conuter = 0;
 public static Node root;
public void addNode( int number) {
Node newNode = new Node( number);
if (root == null){ 
root = newNode;
conuter++;
}
else {
Node focusNode = root;
Node parent;
while (true) {
parent = focusNode;
if(number==focusNode.name)
    break ;
if (number < focusNode.name) {
focusNode = focusNode.leftChild;
if (focusNode == null) {
parent.leftChild = newNode;
conuter++;
return ;
}
} else 
focusNode = focusNode.rightChild;
if (focusNode == null) {
parent.rightChild = newNode;
conuter++;
return; 
}
}
}
}
}
