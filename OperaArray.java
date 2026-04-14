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
    
    public void sumarArry(){
        int suma = 0;
        for (int numero:numeros) {
            suma+=numero;
        }
        System.out.println("Suma de los números es de: " + suma);
    }
    
<<<<<<< HEAD
    public void nuevometodo2(){
        System.out.println("Ejemplo de método 2");
=======
    public void nuevometodo1(){
        System.out.println("Ejemplo de método 1 ");
>>>>>>> bb81a9a0db9d5104e33ee8ae364d7a37c4d91d8c
    }
}
