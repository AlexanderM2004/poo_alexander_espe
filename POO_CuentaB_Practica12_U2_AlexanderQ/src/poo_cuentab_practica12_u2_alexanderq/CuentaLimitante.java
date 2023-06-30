package poo_cuentab_practica12_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class CuentaLimitante extends Cuenta {

    public CuentaLimitante(String nombre, float saldo, long ci) {
        super(nombre, saldo, ci);
    }
    
    @Override
    
    public void deposito(float cant){
        if ((cant > 5)&&(cant < 1000)){
            saldo += cant;
            System.out.println("Saldo: "+saldo);
        }else{
            System.out.println("La cantidad a depositar esta fuera de los limetes perimitidos");
        }
        System.out.println("----------------------------------------------------------------");
    }
    
    @Override
    
    public void retiro(float cant){
        if ((cant > 5)&&(cant < 1000)){
            if(saldo >= cant){
                saldo -= cant;
                System.out.println("Saldo: "+saldo);
            }else{
                System.out.println("NOTA: Su cuenta no tiene los fondos necesarios");
                System.out.println("para realizar el retiro");
            }
        }else{
            System.out.println("La cantidad a retirar esta fuera de los limetes perimitidos");
        }
        System.out.println("----------------------------------------------------------------");
    }
}
