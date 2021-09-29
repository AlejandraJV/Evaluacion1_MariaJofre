package Objetos;

public class Jarrones {

    //Declaración de variables
    private int id;
    private String[] jarrones = {"Cerámica","Porcelana","Vidrio"};
    private int[] precios = {4500,12500,25000};
    private int[] adicional = {150,350,500};

    //Constructores
    public Jarrones(){
        id = 1;
    }

    public Jarrones(int id, String[] jarrones, int[] precios) {
        this.id = id;
        this.jarrones = jarrones;
        this.precios = precios;
    }

    //Accesadores y mutadores

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String[] getJarrones() {

        return jarrones;
    }

    public void setJarrones(String[] jarrones) {

        this.jarrones = jarrones;
    }

    public int[] getPrecios() {

        return precios;
    }

    public void setPrecios(int[] precios) {

        this.precios = precios;
    }

    public int[] getAdicional() {
        return adicional;
    }

    public void setAdicional(int[] adicional) {
        this.adicional = adicional;
    }
    //Calcular precio por cantidad

    public int calcularJarCeramica(int cantidad){
        int precioJC = precios[0];
        int totalJC = precioJC * cantidad;
        return totalJC;
    }
    public int calcularJarPorcelana(int cantidad){
        int precioJP = precios[1];
        int totalJP = precioJP * cantidad;
        return totalJP;
    }
    public int calcularJarVidrio(int cantidad){
        int precioJV = precios[2];
        int totalJV = precioJV * cantidad;
        return totalJV;
    }
    //Sumar precio más adicional

    public int totalJarCeramica(){
        int precioJC = precios[0];
        int adicionalJC = adicional[0];
        int valorJC = precioJC + adicionalJC;
        return valorJC;
    }
    public int totalJarPorcelana(){
        int precioJP = precios[1];
        int adicionalJP = adicional[1];
        int valorJP = precioJP + adicionalJP;
        return valorJP;
    }
    public int totalJarVidrio(){
        int precioJV = precios[2];
        int adicionalJV = adicional[2];
        int valorJV = precioJV + adicionalJV;
        return valorJV;
    }
}
