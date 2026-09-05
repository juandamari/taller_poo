public class miembro {
    private String codigo;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private boolean membresia_activa;

    public miembro () {
    }

    public miembro (String codigo, String nombre, int edad, double peso, double altura, boolean membresia_activa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.membresia_activa = membresia_activa;
    }

    public String getCodigo() {
        return codigo;
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

    public boolean isMembresia_activa() {
        return membresia_activa;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setMembresia_activa(boolean membresia_activa) {
        this.membresia_activa = membresia_activa;
    }

    @Override
    public String toString() {
        return "miembro{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", membresia_activa=" + membresia_activa +
                '}';
    }
    public double calcular_Imc(){
        return(this.peso/(this.altura * this.altura));
    }
    public boolean pagar_mensualidad(double valor){
        if (valor >=100000){
            System.out.println("membresia activa");
            return true;
        } else {
            System.out.println("membresia inactiva");
            return false;
        }
    }
    public String situacion_miembro(){
        double def = calcular_Imc();

        if (def < 18.5) {
            return "peso bajo";
        } else if (def >18.5 && def <24.9){

        }
    }
}
