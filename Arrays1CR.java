package arrays1cr;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1CR {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la longitud del array de enteros que quieres crear: ");
        int longitud = sc.nextInt();
        int array[]  = new int[longitud];
        boolean iterar = true;
        int tamano = array.length;
        int array2[] = new int[tamano];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=i;
        }
        int opcion = -1;
        while (iterar && opcion != 0) {
            System.out.println("Elige una opción del menú:"
                    + "\n1. Rellena el array con un valor"
                    + "\n2. Rellenar con valores distintos"
                    + "\n3. Unir con otro array"
                    + "\n4. Entremezclar con otro array"
                    + "\n5. Imprime el contenido del array"
                    + "\n0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int valor = pedirValor();
                    Arrays.fill(array,valor);
                    System.out.println(Arrays.toString(array));
                    break;
                case 2:
                    int nuevo[] = valoresDistintos(tamano);
                    for (int i = 0; i < array.length; i++) {
                        array[i]=nuevo[i];
                    }
                    System.out.println(Arrays.toString(array));
                    break;
                case 3:
                    int numero3[] = uneArrays(array,array2);
                    System.out.println(Arrays.toString(numero3));
                    break;
                case 4:
                    int array4[] = entremezclaArrays(array,array2);
                    System.out.println(Arrays.toString(array4));
                    break;
                case 5:
                    System.out.println(Arrays.toString(array));
                    break;
                case 0:
                    System.out.println("Adiós.");
                    iterar = false;
                    break;
                default:
                    System.out.println("Introduce una opción válida entre 0 y 5.");
            }
        }
    }
    
    public static int pedirValor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor: ");
        int valor = sc.nextInt();
        return valor;
    }
    
    public static int[] valoresDistintos(int t){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.println("Ingresa un valor: ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static int[] uneArrays(int[]a,int[]b){
        int array3[] = new int[a.length+b.length];
        System.arraycopy(a, 0, array3, 0, a.length);
        System.arraycopy(b,0,array3,a.length,b.length);
        return array3;
    }
    
    public static int[] entremezclaArrays(int[]a,int[]b){
        int array4[] = new int[a.length+b.length];
        for (int i = 0; i < array4.length; i = i+2) { 
            for (int j = 0; j < a.length; j++) {
                array4[i] = a[j];
                array4[i+1]= b[j];
            }
        }
        return array4;
    }
    
    
    
}
