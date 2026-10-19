//By: Edgar PV
// Módulo 1: Almacena y provee los datos iniciales del sistema de ecuaciones.

public class Defmatriz {

    // Retorna la matriz de coeficientes A (5x + y + z, etc.)
    public static double[][] obtenerMatrizA() {
        return new double[][] {
                {5.0, 1.0, 1.0},
                {1.0, 4.0, 1.0},
                {1.0, 2.0, 5.0}
        };
    }

    // Retorna el vector de términos independientes b
    public static double[] obtenerVectorB() {
        return new double[] {7.0, 6.0, 8.0};
    }

    // Retorna el vector de aproximación inicial X(0) = [0, 0, 0]
    public static double[] obtenerVectorX0() {
        return new double[] {0.0, 0.0, 0.0};
    }
}