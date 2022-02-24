import javax.swing.JOptionPane;

public class Lista_Enlazada {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        int opcion=0, valor, pos; 
        do { 
            opcion=Integer.parseInt(JOptionPane.showInputDialog(" --- Menú de Opciones --- \n\n 1. Agregar Nodo al Inicio:\n 2. Buscar Dato en la Lista:\n"+ 
            "3. Actualizar Valor de Nodo en la Lista: \n 4. Mostrar Lista:\n 0. Salir: \n\n "));

            switch(opcion) 
            { 
                case 1: 
                    valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor: ", "Insertando al Inicio"));
                    lista.AgregarInicio(valor); //Se manda a llamar a la función con el valor dado
                break; 
                case 2: 
                    valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor a buscar: ", "Insertando el Número"));
                    lista.Encontrar(valor); System.out.print("\n");
                break; 
                case 3: 
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posición: ", "Comenzando con 1, se derecha a izquierda"));
                    valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor: ", "Para actualizar la lista"));
                    lista.Actualizar(pos, valor); System.out.print("\n");
                break; 
                case 4: 
                    lista.Listar(); System.out.print("\n");
                break; 
                case 0: 
                break; 
                default: 
                JOptionPane.showMessageDialog(null, "Operación Inexistente...");
            }
        } while(opcion!=0);
    }
}
