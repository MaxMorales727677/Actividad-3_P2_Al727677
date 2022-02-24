import javax.swing.JOptionPane;

public class Lista {
    protected Nodo inicio,fin; //Punteros para saber donde está el Inicio y Fin 
    int size=0;
    Lista() { 
        inicio=null; 
        fin=null;
        
    }

    //Método para Agregar un Nodo al Inicio de la Lista 
    public void AgregarInicio(int elemento) { 
        inicio=new Nodo(elemento, inicio); //Se crea el nodo 
        if(fin==null) 
        { 
            fin=inicio; //Verifica si ya se tenían nodos antes, en caso de que no, el fin será igual al inicio, lógicamente. 
        }
        size++;
    }
    public int size() { 
        return size;
    }
    //Método para Mostrar los Datos de la Lista 
    public void Listar() { 
        Nodo recorrer=inicio; 
        while(recorrer!=null) { 
            System.out.print("["+recorrer.dato+"]--->");
            recorrer=recorrer.siguiente;
        }
    }

    //Método para Actualizar un Dato de la Lista
    public void Actualizar(int n, int d) { 
        Nodo recorrer=inicio; 
        int valor=d;
        for(int i=1; i<n; i++) { 
            recorrer=recorrer.siguiente;
        }
        recorrer.dato=valor;
    }

    //Método para Encontrar Valor en la Lista 
    public void Encontrar(int n) { 
        Nodo recorrer=inicio; Boolean Bandera=false; 
        for(int i=0; i<size; i++) 
        { 
            if(n==recorrer.dato) { 
               Bandera=true; 
            }
            recorrer=recorrer.siguiente;
        } 
        if(Bandera==true) { 
            JOptionPane.showMessageDialog(null, "El Valor SI se encuentra en la lista");
        } else
        { 
            JOptionPane.showMessageDialog(null, "El Valor No se encuentra en la lista");
        }
        
    }
}
