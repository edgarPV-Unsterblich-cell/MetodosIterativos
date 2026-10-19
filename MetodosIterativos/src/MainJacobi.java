// By: Edgar PV
// Módulo 3: Ejecuta la prueba del Método de Jacobi

public class MainJacobi {

    public static void main(String[] args) {
        // Obtener la matriz y vectores desde Defmatriz
        double[][] A = Defmatriz.obtenerMatrizA();
        double[] b = Defmatriz.obtenerVectorB();
        double[] x0 = Defmatriz.obtenerVectorX0();

        // Definir tolerancia (0.0001) y máximo de iteraciones (100)
        double tol = 0.0001;
        int maxIter = 100;

        // Ejecutar el método de Jacobi
        double[] solucion = MetodoJacobi.resolver(A, b, x0, tol, maxIter);

        // Mostrar el resultado final en pantalla
        System.out.print("Solución aproximada (Jacobi): [ ");
        for (double val : solucion) {
            System.out.printf("%.5f ", val);
        }
        System.out.println("]");
    }
}