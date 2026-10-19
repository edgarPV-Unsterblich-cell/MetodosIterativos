// By: Edgar PV
// Módulo 2: Lógica del Método de Gauss-Seidel (actualiza los valores de forma inmediata)

public class MetodoGaussSeidel {

    // Función principal para resolver el sistema por Gauss-Seidel
    public static double[] resolver(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone(); // Vector de trabajo que se actualiza directamente

        // Repetir hasta el número máximo de iteraciones
        for (int k = 0; k < maxIter; k++) {
            double[] xAnt = x.clone(); // Guardar una copia previa solo para calcular el error al final

            // Recorrer cada fila de la matriz
            for (int i = 0; i < n; i++) {
                double suma = 0.0; // Reiniciar la suma para cada variable

                // Sumar los términos excluyendo la diagonal principal
                // (Gauss-Seidel usa de inmediato los valores recién calculados dentro de 'x')
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }

                // Actualizar inmediatamente la variable x[i]
                x[i] = (b[i] - suma) / A[i][i];
            }

            // Si el error es menor que la tolerancia requerida, terminar
            if (calcularError(xAnt, x) < tol) {
                return x; // Retorna la solución
            }
        }

        // Si llega al límite de iteraciones, retorna el resultado actual
        return x;
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