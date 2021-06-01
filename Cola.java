package tallercolas;


public class Cola {
    private int [] elementos;
    private int numMaxElementos;
    private static int Elementos_Max = 5;
    private int Frente;
    private int Fin;

    public Cola(int numElementos) {
        this.numMaxElementos = numElementos;
        this.elementos = new int [this.numMaxElementos];
        this.Frente = 0;
        this.Fin = 0;
        
    }
    
    public Cola() {
         this.numMaxElementos = Elementos_Max;
        this.elementos = new int [this.numMaxElementos];
        this.Frente = 0;
        this.Fin = 0;
    }
    
    public boolean insertar(int nuevoElemento){
        if (this.listaLlena ()){
        return false;
        } else {
            this.elementos[Fin] = nuevoElemento;
            this.Fin++;
            return true;
        }
    }
    
    public int quitar (){
       if (this.listaVacia()) {
           return -1;
       } else{
           int elementosRetornar = this.elementos[Frente];
           this.Frente ++;
           return this.elementos[Frente];
           
       }
    }
    
    public boolean listaLlena (){
        return this.Fin >= this.numMaxElementos;
    }
    
    public boolean listaVacia (){
      return this.Fin == this.Frente;  
    }
}
  