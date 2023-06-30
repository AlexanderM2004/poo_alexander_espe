package poo_cuentab_practica12_u2_alexanderq;

/**
 * @author Alexander Quihpe
 */

public class Cuenta {
    private String nombre;
    private long ci;
    float saldo;
    
    public Cuenta(String nombre, float saldo, long ci){
        this.nombre = nombre;
        this.saldo = saldo;
        this.ci = ci;
    }
    
    public void deposito(float cant){
        saldo += cant;
    }
    
    public void retiro(float cant){
        saldo -= cant;
    }
    
    public float getSaldo(){
        return saldo;
    }
}
