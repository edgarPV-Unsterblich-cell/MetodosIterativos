// By: Edgar PV
// Módulo 2: Lógica del Método de Jacobi (usa vector auxiliar para calcular la nueva iteración)

public class MetodoJacobi {

    // Función principal para resolver el sistema por Jacobi
    public static double[] resolver(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone();          // Guarda los valores actuales
        double[] xNuevo = new double[n];  // Vector auxiliar para guardar los nuevos valores calculados

        // Repetir hasta el número máximo de iteraciones
        for (int k = 0; k < maxIter; k++) {

            // Recorrer cada fila de la matriz
            for (int i = 0; i < n; i++) {
                double suma = 0.0; // Reiniciar la suma para cada variable

                // Sumar los productos de la fila excluyendo la diagonal principal (j != i)
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }

                // Despejar la variable actual y guardarla en el vector auxiliar
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            // Si el error entre la iteración anterior y la nueva es menor a la tolerancia, terminar
            if (calcularError(x, xNuevo) < tol) {
                return xNuevo; // Retorna la solución exacta
            }

            // Copiar los nuevos valores al vector x para la siguiente iteración
            x = xNuevo.clone();
        }

        // Si se acaba el límite de iteraciones, retorna la última aproximación
        return xNuevo;
    }

    // Calcula la diferencia máxima entre los valores viejos y nuevos (error)
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double max = 0.0;
        for (int i = 0; i < xAnt.length; i++) {
            max = Math.max(max, Math.abs(xNuevo[i] - xAnt[i]));
        }
        return max;
    }
}