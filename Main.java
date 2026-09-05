//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    vehiculos vh1 = new vehiculos("RGU 752", "chevrolet", 2011, 245, 21.2, 15780, true);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese los kilómetros recorridos: ");
    double kmRecorridos = scanner.nextDouble();

    System.out.println("Ingrese los litros de combustible consumidos: ");
    double litrosConsumidos = scanner.nextDouble();

    vh1.rendimiento();
    System.out.println("el rendimiento del vehiculo es de: " + vh1.rendimiento() + "km/L");

    vh1.clasificarRendimiento();
    System.out.println("el vehoculo rindio: " + vh1.clasificarRendimiento());

    vh1.calcularCostoCombustible();
    System.out.printf("el costo del combustible fue: " + vh1.calcularCostoCombustible());

    System.out.println("");
    vh1.costoPorKilometro();
    System.out.println("el precio por km es de: $" + vh1.costoPorKilometro());
}
