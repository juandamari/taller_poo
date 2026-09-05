//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

}
//UN GIMNASIO necesita representar a cada uno de los miembros que asisten y desea que se modele una clase que permita calcular
//el estado fisico y los pagos mensuales de los clientes, la clase se llama " miembro" y tiene como atributos ID String
//nombre String, edad int, peso double, altura double y membresia activa boolean. esta clase tiene metodos: calcular IMC= peso(kg)/altura(m)**2 - double y return IMC
//segun el IMC se debe indicar: IMC - situacion, 1) menor a 18.5 situacion: peso bajo 2) 18.5-24.9 peso: normal 3) 25-26.9 peso: sobrepeso de grado 1 4) 27-29.9
//sobre peso de grado 2 5) 30-34.9 peso: obesidad de tipo 1 6) 25-39.9 obesidad de tipo 2 7)40.49.9 peso: obesidad morvida 8) 50 peso: obesivdad extrema
//segundo metodo: pagar mensualidad boolean - recibe double: "valor" ejm si valor<=100 000 la membresia se activa y return: true.
//metodo: "actualizar peso" boolean - recibe double: "nuevo peso" ejm: 0< se actualiza y return: true.
//main: 3 obejtos retorna "calcular" - "pagar mensualidad" - "actualizar peso"