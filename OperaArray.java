package practica.entornos.eman_zouine;

/**
 * Eman Zouine Es-Sakhi
 */
public class OperaArray {
    private int[] numeros = new int[10];
    
    public int[] rellenaArray(){
        for (int i = 0; i < this.numeros.length; i++) {
            this.numeros[i] = (int)(Math.random() * 21);
        }
        return this.numeros;
    }

    public void imprimirArray(){
        for (int numero:this.numeros) {
            System.out.println(numero + ", ");
        }
    }

<<<<<<< HEAD
    public void nuevometodo1(){
        System.out.println("Ejemplo de método 1 ");
=======
    public void sumarArry(){
        int suma = 0;
        for (int numero:numeros) {
            suma+=numero;
        }
        System.out.println("Suma de los números es de: " + suma);
>>>>>>> 6d24dd16c01b18dc596cad85a4b94391d2e2c38d
    }
}
