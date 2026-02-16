import java.util.Scanner;
public class ArregloNotas {


    public static double[] notas = new double[5];

    public static void main(String[] args) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = ingresarNota("Ingrese la nota del estudiante : ");
        }
        double promedio = calcularPromedio(notas);
        double mayor = encontrarNotaMayor(notas);
        double menor = encontrarNotaMenor(notas);
        ordenarNotas(notas);
        resumen(notas, promedio, mayor, menor);
        notasPerdidas(notas);
    }

    public static double ingresarNota(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            contador++;
        }
        double promedio = suma / contador;
        return promedio;
    }

    public static double encontrarNotaMayor(double[] notas) {
        double mayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }

    public static double encontrarNotaMenor(double[] notas) {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    public static void ordenarNotas(double[] notas) {
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    double temp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = temp;
                }
            }
        }
    }

    public static void resumen(double[] notas, double promedio, double mayor, double menor) {
        System.out.println("Resumen de notas:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
    }

    public static void notasPerdidas(double[] notas) {
        int contadorPerdidas = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 3.0) {
                contadorPerdidas++;
            }
        }
        System.out.println("Cantidad de notas perdidas: " + contadorPerdidas);
    }

}