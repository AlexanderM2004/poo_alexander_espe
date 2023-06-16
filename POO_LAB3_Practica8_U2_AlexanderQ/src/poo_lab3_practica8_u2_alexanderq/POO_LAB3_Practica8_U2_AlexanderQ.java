/*
 * Programa que permite calcular areas y perimetros de figuras geometricas
 */
package poo_lab3_practica8_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_LAB3_Practica8_U2_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        Cuadrado cua = new Cuadrado();
        Rectangulo rec = new Rectangulo();
        Triangulo trian = new Triangulo();
        Poligono penta = new Poligono();

        int opc, op;
        float medi, mediA, mediB, base, alt;

        do {
            System.out.println("--------------CALCULADORA DE AREAS Y PERIMETROS--------------");
            System.out.println("1: Calcular Areas");
            System.out.println("2: Calcular Perimetros");
            System.out.println("3: Salir");
            opc = lectura.nextInt();

            if (opc == 1) {
                System.out.println("--------------------CALCULADORA DE AREAS---------------------");
                System.out.println("1: Cuadrado");
                System.out.println("2: Rectangulo");
                System.out.println("3: Triangulo");
                System.out.println("4: Pentagono Regular");
                op = lectura.nextInt();

                switch (op) {
                case 1:
                    System.out.println("--------------AREA CUADRADO--------------");
                    System.out.print("Ingrese medida del cuadrado: ");
                    medi = lectura.nextFloat();
                    System.out.println("Area: "+ cua.calcularArea(medi));
                    break;
                case 2:
                    System.out.println("--------------AREA RECTANGULO--------------");
                    System.out.print("Ingrese medida del lado A del rectangulo: ");
                    mediA = lectura.nextFloat();
                    System.out.print("Ingrese medida del lado B del rectangulo: ");
                    mediB = lectura.nextFloat();
                    System.out.println("Area: "+ rec.calcularArea(mediA, mediB));
                    break;
                case 3:
                    System.out.println("--------------AREA TRIANGULO--------------");
                    System.out.print("Ingrese medida de la base del triangulo: ");
                    base = lectura.nextFloat();
                    System.out.print("Ingrese medida de la alturo del triangulo: ");
                    alt = lectura.nextFloat();
                    System.out.println("Area: "+ trian.calcularArea(base, alt));
                    break;
                case 4:
                    System.out.println("--------------AREA PENTAGONO--------------");
                    System.out.print("Ingrese medida del lado del pentagono: ");
                    medi = lectura.nextFloat();
                    System.out.println("Area: "+ penta.calcularArea(medi));
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada");
                    break;
                }

            }else {
                if (opc == 2){
                    System.out.println("--------------------CALCULADORA DE PERIMETROS---------------------");
                    System.out.println("1: Cuadrado");
                    System.out.println("2: Rectangulo");
                    System.out.println("3: Triuangulo");
                    System.out.println("4: Pentagono Regular");
                    op = lectura.nextInt();

                    switch (op) {
                    case 1:
                        System.out.println("--------------PERIMETRO CUADRADO--------------");
                        System.out.print("Ingrese medida del cuadrado: ");
                        medi = lectura.nextFloat();
                        System.out.println("Perimetro: "+ cua.calcularPerimetro(medi));
                        break;
                    case 2:
                        System.out.println("--------------PERIMETRO RECTANGULO--------------");
                        System.out.print("Ingrese medida del lado mayor del rectangulo: ");
                        mediA = lectura.nextFloat();
                        System.out.print("Ingrese medida del lado menor del rectangulo: ");
                        mediB = lectura.nextFloat();
                        System.out.println("Perimetro: "+ rec.calcularPerimetro(mediA, mediB));
                        break;
                    case 3:
                        System.out.println("--------------PERIMETRO TRIANGULO--------------");
                        System.out.print("Ingrese medida del lado 1 del triangulo: ");
                        mediA = lectura.nextFloat();
                        System.out.print("Ingrese medida del lado 2 del triangulo: ");
                        mediB = lectura.nextFloat();
                        System.out.print("Ingrese medida del lado 3 del triangulo: ");
                        base = lectura.nextFloat();
                        System.out.println("Perimetro: "+ trian.calcularPerimetro(base, mediA, mediB));
                        break;
                    case 4:
                        System.out.println("--------------PERIMETRO PENTAGONO--------------");
                        System.out.print("Ingrese medida del lado del pentagono: ");
                        medi = lectura.nextFloat();
                        System.out.println("Perimetro: "+ penta.calcularPerimetro(medi));
                        break;
                    default:
                        System.out.println("No existe la opcion seleccionada");
                        break;
                    }
                }else{
                    if(opc == 3){
                        System.out.println("Muchas Gracias por preferirnos, saliendo ...");
                    }else{
                        System.out.println("No existe la opcion seleccionada, por favor vuelva a intetarlo");
                    }
                }
            }
        }while(opc != 3);
    }
}
