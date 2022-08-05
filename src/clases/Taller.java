package clases;

import java.util.Arrays;
import java.util.Scanner;
public class Taller extends Vehiculo{
    //Atributo Clase Taller
    private boolean arreglado;
    //Creamos el array
    Vehiculo vehiculos[]= new Vehiculo[5];
    int contador=0;



    //Instancia del Scanner
    Scanner entrada= new Scanner(System.in);
    //Constructor Vacio
    public Taller() {
    }

    //Constructor con Parametros
    public Taller(int ID, String marca, String modelo, String tipoMotor, String color, double km, boolean arreglado) {
        super(ID, marca, modelo, tipoMotor, color, km);
        this.arreglado = arreglado;
    }


    //Metodos Set y Getter
    public boolean isArreglado() {
        return this.arreglado;
    }

    public void setArreglado(boolean arreglado) {
        this.arreglado = arreglado;
    }

    //toString
    @Override
    public String toString() {
        return "Taller{" +
                "arreglado=" + arreglado +
                "} " + super.toString();
    }

    //Metodo Aniadir Carro
    public void agregarCarro(){
        for (int i=0;i<vehiculos.length;i++){
            System.out.println("-----------------------------");
            System.out.println("Ingrese Datos del Vehiculo: "+(i+1));
            System.out.print("Ingrese ID vehiculo: ");
            int id= entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese Marca Vehiculo: ");
            String marca= entrada.nextLine();
            System.out.print("Ingrese Modelo Vehiculo");
            String modelo= entrada.nextLine();
            System.out.print("Ingrese Tipo Motor Vehiculo: ");
            String motor= entrada.nextLine();
            System.out.print("Ingrese Color Vehiculo: ");
            String colorVehiculo= entrada.nextLine();
            System.out.print("Ingrese KM Vehiculo: ");
            double km= entrada.nextDouble();
            entrada.nextLine();
            vehiculos[i]= new Vehiculo(id,marca,modelo,motor,colorVehiculo,km);
            System.out.println("-----------------------------");
        }
    }

    //Metodo Mostrar Carro
    public void mostrarDatos(){
        for (int i=0;i<vehiculos.length;i++){
            System.out.println("Desplegando Datos Vehiculos: ");
            System.out.println("Vehiculo: "+(i+1));
            System.out.println("ID Vehiculo: " +vehiculos[i].getID()+" "+" Marca Vehiculo: "+vehiculos[i].getMarca()+" "+" Modelo Vehiculo: " +vehiculos[i].getModelo()+" " +
                    " "+" Tipo Motor Vehiculo: "+vehiculos[i].getTipoMotor()+" "+" Color Vehiculo: "+vehiculos[i].getColor()+" "+" KM Vehiculo: "+vehiculos[i].getKm()+""+"\n");
        }
    }


    //Metodo Reparar Carros
    public void repararAutos(){
        while(contador<2) {
            System.out.println("Ingrese posicion de vehiculo a reparar: ");
            int posicion= entrada.nextInt();
            for (int i = 0; i < vehiculos.length; i++) {
                if (posicion == vehiculos[i].getID()) {
                    System.out.println("Vehiculo Encontrado!");
                    System.out.println("Reparando...");
                    vehiculos[i].setID(0);
                    vehiculos[i].setMarca(null);
                    vehiculos[i].setModelo(null);
                    vehiculos[i].setTipoMotor(null);
                    vehiculos[i].setColor(null);
                    vehiculos[i].setKm(0.00);
                    vehiculos[i].setArreglado(true);
                    contador++;
                }
            }
            System.out.println("El vehiculo No. "+(posicion)+" Ha sido Sacado ya del Taler!");
        }
        mostrarDatos();
        }
    }
