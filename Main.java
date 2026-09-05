//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner teclado = new Scanner(System.in);

    String id;
    String nombre;
    int edad;
    double peso;
    double altura;
    int op;
    clientes c1 = null;
    List<clientes>lstClientes = new ArrayList<>();

    boolean estado = true;
    while (estado) {


        System.out.println("""
                1. CREAR CLIENTE
                2. CALCULAR IMC
                3. CLASIFICAR IMC
                4. INGRESQAR NUEVO PESO
                5. Mostrar clientes 
                6. Buscar cliente
                7. SALIR""");

        System.out.println("seleciones una opcion del menu:");
        op = teclado.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese su id:");
                id = teclado.next();
                System.out.println("Ingrese su nombre:");
                nombre = teclado.next();
                System.out.println("Ingrese su edad:");
                edad = teclado.nextInt();
                System.out.println("Ingrese su peso:");
                peso = teclado.nextDouble();
                System.out.println("Ingrese su altura:");
                altura = teclado.nextDouble();
                lstClientes.add(new clientes(id, nombre, edad, peso, altura));
                break;

            case 2:
                String codigo1;
                System.out.println("ingrese el id a buscar:");
                codigo1 = teclado.next();
                clientes encontrado1 = null;
                for (clientes c : lstClientes){
                    if(c.getId().equalsIgnoreCase(codigo1)){
                        encontrado1 = c;
                    }
                }
                if(encontrado1 != null){
                    System.out.println(encontrado1);
                } else {
                    System.out.println("no encontrado");
                }
                if (encontrado1 != null) {
                    System.out.println("calulcar IMC:"+ encontrado1.calculcarIMC());

                } else {
                    System.out.println("no se ha ingresado cliente");
                }
                break;
            case 3:
                //iterar para encontrar el codigo
                String codigo2;
                System.out.println("ingrese el id a buscar:");
                codigo2 = teclado.next();
                clientes encontrado2 = null;
                for (clientes c : lstClientes){
                    if(c.getId().equalsIgnoreCase(codigo2)){
                        encontrado2 = c;
                    }
                }
                if(encontrado1 != null){
                    System.out.println(encontrado2);
                } else {
                    System.out.println("no encontrado");
                }
                //agregar la formula que necesita
                if (encontrado2 != null) {
                    System.out.println("clasificar IMC"+encontrado2.clasificarIMC());
                } else {
                    System.out.println("no se ha ingresado cliente");
                }
                break;

            case 4:
                System.out.println("ingresar nuevo peso");
                break;
            case 5:
                System.out.println("mostrar clientes");
                if(lstClientes.isEmpty()){
                    System.out.println("no hay clientes");
                }else {
                    for (clientes c : lstClientes)
                        System.out.println(c);
                }
                break;
            case 6:
                System.out.println("mostrar por id");
                String codigo;
                System.out.println("ingrese el id a buscar:");
                codigo = teclado.next();
                clientes encontrado = null;
                for (clientes c : lstClientes){
                    if(c.getId().equalsIgnoreCase(codigo)){
                        encontrado = c;
                    }
                }
                if(encontrado != null){
                    System.out.println(encontrado);
                } else {
                    System.out.println("no encontrado");
                }
                break;
            case 7:
                System.out.println("salir");
                estado = false;
                break;
        }
    }







}
