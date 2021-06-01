package tallercolas;

public class Cola3  {

  public class Nodo {
    Nodo next;
    Nodo anterior;
    Object dato;

    public Nodo(Nodo next, Object data) {
      this.next = next;
      this.dato = data;
    }

    public Nodo(Object elem) {
      this(null, elem);
    }
  }

  private Nodo primero;
  private Nodo posicionActual;

  
   // Incrementa la posición actual 
   
  public void adelante (int numPosicion) {
    if (numPosicion > 0 && primero != null) {
      int positionsForward = numPosicion;
      if (posicionActual == null) {
        posicionActual = primero;
        positionsForward--;
      }
      while (posicionActual.next != null && positionsForward > 0) {
        posicionActual = posicionActual.next;
        positionsForward--;
      }
    }
  }

   // Inserta un objeto en posicionActual
   
  public void insertar(Object data) {
    Nodo node = new Nodo(data);

    if (posicionActual == null) {
      // inserta en el primer nodo
      node.next = primero;
      if (primero != null) {
        primero.anterior = node;
      }
      primero = node;
    } else {
        
      // el nodo no es el primero
      
      node.next = posicionActual.next;
      node.anterior = posicionActual;
      if (posicionActual.next != null) {
        posicionActual.next.anterior = node;
      }
      posicionActual.next = node;
    }
    // actualiza la posición actual
    posicionActual = node;
  }

  // Elimina el nodo al que hace referencia
   
  public Object extraer() {
    Object dato = null;

    if (posicionActual != null) {
      dato = posicionActual.dato;

      // 'eliminar' el nodo
      
      if (primero == posicionActual) {
        primero = posicionActual.next;
      } else {
        posicionActual.anterior.next = posicionActual.next;
      }

      if (posicionActual.next != null) {
        posicionActual.next.anterior = posicionActual.anterior;
      }
      
      // Siguiente posicion
      posicionActual = posicionActual.next;
    }
    return dato;
  }
}
    

