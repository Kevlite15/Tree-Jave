public class TNode<E extends Comparable<E>> {

 private E data;           //the data stored.
 private TNode<E> left;    //the left subtree.
 private TNode<E> right;   //the right subtree.
 
 public TNode(E thing) {
  data = thing;
 }

 /**
  * Gets the left subtree
  * @return the left child.
  */
 public TNode<E> getLeft() {
  return left;
 }

 /**
  * Sets the left subtree.
  * @param left the new left child.
  */
 public void setLeft(TNode<E> left) {
  this.left = left;
 }

 /**
  * Gets the right subtree.
  * @return the right child.
  */
 public TNode<E> getRight() {
  return right;
 }

 /**
  * Sets the right subtree.
  * @param right the new right child.
  */
 public void setRight(TNode<E> right) {
  this.right = right;
 }
 
 /**
  * Returns the data stored by this node.
  * @return the data stored by this node.
  */
 public E getData() {
  return data;
 }

 /** sets the data stored by this node.
  * @param data the new thing to be stored.
  */
 public void setData(E data) {
  this.data = data;
 }
 
}