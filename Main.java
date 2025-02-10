/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Facultad de Ingeniería
 * Departamento de Ciencias de la Computación
 * Curso: Algoritmos y Estructura de Datos - CC2016
 * Autor: Daniel Fgueroa y Oliver Cifuentes
 * Fecha: 10/02/2025
 * 
 * Descripción:
 * Clase principal que coordina la ejecución del programa, generando números, 
 * aplicando algoritmos de ordenamiento y midiendo el tiempo de ejecución.
 */

 import java.util.Arrays;

 public class Main {
     public static void main(String[] args) {
         int[] numeros = GeneradorNumeros.generarNumerosAleatorios(10, 10000);
         GeneradorNumeros.guardarEnArchivo(numeros, "numeros.txt");
 
         int[] datos = LectorArchivo.leerDesdeArchivo("numeros.txt");
        
         System.out.println("Ordenando con diferentes algoritmos...");
 
         MedidorTiempo.medir(new InsertionSort(), datos, "Insertion Sort");
         MedidorTiempo.medir(new MergeSort(), datos, "Merge Sort");
         MedidorTiempo.medir(new QuickSort(), datos, "Quick Sort");
         MedidorTiempo.medir(new RadixSort(), datos, "Radix Sort");
         MedidorTiempo.medir(new BucketSort(), datos, "Bucket Sort");
     }
 }