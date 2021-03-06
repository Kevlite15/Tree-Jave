import java.util.ArrayList;


public class Tree<E extends Comparable<E>> {
 private TNode<E> root;
 
 public void insert(E data) {
  root = insert(root, data); 
 }
 
 private TNode<E> insert(TNode<E> t, E data) {
  if(t == null) return new TNode<E>(data);
  if(data.compareTo(t.getData()) < 0) {
   t.setLeft(insert(t.getLeft(), data));
   return t;
  } else {
   t.setRight(insert(t.getRight(), data));
   return t;
  }
 }
 
 public void insert2(E data) {
  root = insert2(root, data); 
 }
 
 private TNode<E> insert2(TNode<E> t, E data) {
   //Temp variable
   TNode<E> temp = t;
   //Base case
   if(temp == null) return new TNode<E>(data);
   //While loop to itierate though tree
   while(temp != null){
     //Checks if the data is bigger then the data in the node
     if(data.compareTo(temp.getData()) < 0){
       //Checks if there is a next node
       if(temp.getLeft() != null)
       //assigns temp tot he next node
       temp = temp.getLeft();
       else{
         //exits loop if there is not a next node
         break;
       }
     }
     //if the data is smaller then the data in the node
     else{
       //checks if the next node is null
       if(temp.getRight() != null)
       //goes to next next node
       temp = temp.getRight();
       else{
         //exits loop
         break;
       }
     }
   }
   //checks if the data is smaller then the current node
   if(data.compareTo(temp.getData()) < 0){
     //puts the new n node to the left of the data
     temp.setLeft(new TNode<E>(data));
     //returns tree
     return t;
   }
   //if the data is bigger then the current node
   else{
     //assigns the new node to the right of the current node
     temp.setRight(new TNode<E>(data));
     //returns tree
     return t;
   }
 }

 public void print() {
  print(root);
 }

 private void print(TNode<E> t) {
  if(t == null) return;
  print(t.getLeft());
  System.out.print(t.getData() + "\t");
  print(t.getRight());
 }
 
 public ArrayList<E> asArray() {
  ArrayList<E> ans = new ArrayList<E>();
  asArray(root, ans);
  return ans;
 }

 private void asArray(TNode<E> t, ArrayList<E> arr) {
   //base case
   TNode<E> temp = t;
   if (t == null); // Do nothing
   //Gets the left nodes vaules 
   asArray(t.getLeft(), arr);
   //adds the current nodes value to the arrray list from the tree
   arr.add(temp.getData());
   //Gets the right nodes values
   asArray(t.getRight(), arr);
   
 }

 public int size() {
  return size(root);
 }

 private int size(TNode<E> t) {
  if(t == null) return 0;
  return size(t.getLeft()) + 1 + size(t.getRight());
 }
 
 public int getHeight() {
   return getHeight(root);
 }
 
 private int getHeight(TNode<E> t){
   //Variables
   int height1 = 0;
   int height2 = 0;
   //Base Case
   if (t == null) return 0;
   //2nd Base case
   if ((t.getLeft() == null) && (t.getRight() == null)) 
     return 1;
   //recursively calls the fuction to get the height for the left subtree
   height1 = getHeight(t.getLeft());
   //recursively calls the fuction to get the height for the right subtree
   height2 = getHeight(t.getRight());
   //Checks which height of the subtrees is higher then returns height
   if(height1 > height2)
     return height1 + 1;
   else{
     return height2 + 1;
   }
 }
 
}