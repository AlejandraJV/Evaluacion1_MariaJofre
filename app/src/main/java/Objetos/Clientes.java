package Objetos;

public class Clientes {
    //Declaración de variables
    private int id;
    private String[] clientes = {"Sermieh","Jacinta"};
    private int[] salarios = {45000,55000};

    //Constructores

    public Clientes(){
        id = 1;
    }

    public Clientes(int id, String[] clientes, int[] salarios) {
        this.id = id;
        this.clientes = clientes;
        this.salarios = salarios;
    }


    //Accesadores y mutadores

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String[] getClientes() {

        return clientes;
    }

    public void setClientes(String[] clientes) {

        this.clientes = clientes;
    }

    public int[] getSalarios() {

        return salarios;
    }

    public void setSalarios(int[] salarios) {

        this.salarios = salarios;
    }

    //Descontar dinero del salario
    public int descontarSermieh(int valor){
        int salarioSermieh = salarios[0];
        int totalSermieh = salarioSermieh - valor;
        return totalSermieh;
    }
    public int descontarJacinta(int valor){
        int salarioJacinta = salarios[1];
        int totalJacinta = salarioJacinta - valor;
        return totalJacinta;
    }
}
