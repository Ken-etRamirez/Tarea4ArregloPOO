package clases;

public class Vehiculo {
    //Atributos
    private int ID;
    private String marca;
    private String modelo;
    private String tipoMotor;
    private String color;
    private double km;

    //Constructor Vacio
    public Vehiculo() {
    }

    //Constructor con Parametros
    public Vehiculo(int ID, String marca, String modelo, String tipoMotor, String color, double km) {
        this.ID = ID;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.color = color;
        this.km = km;
    }


    //Metodos Setter y Getter

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    //toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("ID=").append(ID);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", tipoMotor='").append(tipoMotor).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", km=").append(km);
        sb.append('}');
        return sb.toString();
    }

    protected void setArreglado(boolean b) {
    }
}
