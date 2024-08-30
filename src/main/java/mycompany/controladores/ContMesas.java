package mycompany.controladores;

import java.util.Scanner;

import mycompany.logica.Mesa;

public class ContMesas extends Mesa {

    @Override
    public String getNomCamarero() {
        return super.getNomCamarero();
    }

    @Override
    public int getNumMesa() {
        return super.getNumMesa();
    }

    @Override
    public void setNomCamarero(String nomCamarero) {
        super.setNomCamarero(nomCamarero);
    }

    @Override
    public void setNumMesa(int numMesa) {
        super.setNumMesa(numMesa);
    }

    public Mesa crearMesa(Mesa mesa){
        System.out.println("Ingrese el numero de mesa");
        Scanner tec2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del camarero");
        Scanner tec3 = new Scanner(System.in);
        tec3.next();
        return mesa;
    }       
}


