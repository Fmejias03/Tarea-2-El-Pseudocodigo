public class Ejercicio1 {
    //¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?
    //
    //Algo ValoresDeLasVariables
    //variable a, b: entero
    //Inicio
    //   a <- 3
    //   escribir("a = " & a)
    //   b<-a+5
    //   escribir("a = " & a & " y b = " & b)
    //   a<-7
    //   escribir("a = " & a & " y b = " & b)
    //Fin

    public static void main(String[] args) {
        int a, b;
        a = 3;
        System.out.println("a = " + a);
        b = a + 5;
        System.out.println("a = " + a + " y b = " + b);
        a = 7;
        System.out.println("a = " + a + " y b = " + b);
    }

    //Este codigo muestra el valor de "a" y "b", preestableciendo un valor predeterminado a "a" y "b" dependiendo de el valor de "a"
}