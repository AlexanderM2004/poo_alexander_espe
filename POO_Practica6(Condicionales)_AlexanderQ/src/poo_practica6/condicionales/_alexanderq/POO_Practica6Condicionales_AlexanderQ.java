//Estructuras condicionales
package poo_practica6.condicionales._alexanderq;
public class POO_Practica6Condicionales_AlexanderQ {
    public static void main(String[] args) {
        int hora = 28;
        if ((hora >=0)&&(hora<=24)){
            if((hora >=0)&& (hora<=12)){
            System.out.println("Buenos dias");
        }else if ((hora>12)&&(hora<=19)){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        }
        }else{
            System.out.println("Hora incorrecta, vuelva a ingresar la hora en un rango de 0-24");
        }
    }
    
}
