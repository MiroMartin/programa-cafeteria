import java.util.Scanner;

import mycompany.controladores.ContMesas;
import mycompany.logica.Mesa;

public class Main {
    public static void main(String[] args){
        
        System.out.println("-----------------------");
        System.out.println("Bienvenido");
        System.out.println("Elija una opcion para continuar");
        System.out.println("1. Crear una mesa");
        System.out.println("2. Editar una mesa");
        System.out.println("3. Cerrar una mesa");
        System.out.println("4. Salir");
        System.out.println("-----------------------");
    
        ContMesas controlM = new ContMesas();
        Mesa mesa[] = new Mesa[20];

        int i = 0;
        for(i=0; i<20; i++){
            System.out.println(mesa[i]);
        }   
        
        Scanner tec = new Scanner(System.in);
        tec.nextInt();
    

    }
}
