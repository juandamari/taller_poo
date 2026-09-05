public class clientes {
    private String id;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public clientes() {
    }

    public clientes(String id, String nombre, int edad, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "clientes{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    //metodos propios


    public double calculcarIMC (){
        return peso/(altura*altura);
    }

    public String clasificarIMC(){
        double imc = calculcarIMC();
        String situacion;

        if(imc<18.5) {
            situacion = "peso bajo";

        }else if (imc < 25) {
                situacion = "peso normal";
            } else if (imc < 30) {
                situacion = "sobre peso";
            } else {
                situacion = "obesidad";
            }
            return situacion;
    }

    public boolean actualizarPeso(double nuevoPeso){
        if(nuevoPeso>0){
            peso = nuevoPeso;
            return true;
        }else {
            return false;
        }
    }


}
