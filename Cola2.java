
package tallercolas;


public class Cola2 {
//COLAS CON LISTA ENLAZADA SIMPLE
  class Node {
    Object elem;
    Node Next;

    public Node(Object o) {
      elem = o;
      Next = null;
    }
  }

  Node primero;
  Node end;
  int tamaño;

  public Cola2() {
    end = null;
    tamaño = 0;
  }

  public void insertar(Object o) {
    Node new_node = new Node(o);
    if (primero == null) {
      primero = new_node;
      end = new_node;
    } else {
      end.Next = new_node;
      end = new_node;
    }
    tamaño++;
  } // Inserta un objeto a la cola

  public Object quitar() {
    if (primero == null)
      return null;
    Object o = primero.elem;
    primero = primero.Next;
    tamaño--;
    return o;
  } 
  // Obtiene el objeto de la cola

  public boolean vacio() {
    return (tamaño == 0);
  }

  public int tamaño() {
    return tamaño;
  }

  public Object first() {
    if (primero == null)
      return null;
    else
      return primero.elem;
  }

}
    

