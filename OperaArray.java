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
}
