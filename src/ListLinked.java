class Node{
		Node next;
		protected Trabajador data;
	   }
class Linked {
  public Node mergeSortRec(Node node) {//ordena la lista enlazada
    if(node == null || node.next == null) {
      return node;
    }
    
    Node middle = NodoMedio(node);
    Node secondHalf = middle.next;
    middle.next = null;
    
    return merge(mergeSortRec(node), mergeSortRec(secondHalf));
  }
  

  public Node NodoMedio(Node node) {
    if(node == null) {
      return null;
    }
    
    Node a = node;
    Node b = node.next;
    
    while(b != null && b.next != null) {
      a = a.next;
      b = b.next.next;
    }
    
    return a;
  }
  public Node merge(Node a, Node b) {
    Node temp = new Node();
    Node finalList = temp;
    
    while(a != null && b != null) {
      if(a.data.compareTo(b.data) == -1) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    temp.next = (a == null) ? b : a;
    return finalList.next;
  }
  public Node getNewNode(Trabajador trabajador) {
    Node a = new Node();
    a.next = null;
    a.data = trabajador;
    return a;
  }
  public Node insertRec(Trabajador trabajador, Node node) {

    if (node == null)
      return getNewNode(trabajador);
    else
      node.next = insertRec(trabajador, node.next);

    return node;
  }
  public Node buscar(Trabajador trabajador,Node a) {
	  Node indice = a;
	  while(indice != null) {
		  if(indice.data == trabajador) {
			  return indice;
		  }
		  indice = getNewNode(trabajador);
		  
	  }
	  return null;
  }
  public void printListRec(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printListRec(node.next);
  }
}