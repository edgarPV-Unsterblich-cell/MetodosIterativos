# MetodosIterativos
Tarea 2 Unidad 3 para Metodos Numericos
# Práctica de Programación Modular en Java: Métodos Iterativos

By: Edgar PV  
**Asignatura:** Estructura de Datos y Métodos Numéricos  

---

## Descripción del Proyecto
Este proyecto implementa los métodos iterativos de **Jacobi** y **Gauss-Seidel** para la resolución de sistemas de ecuaciones lineales $Ax = b$ mediante una arquitectura modular en Java dividida en tres componentes:

1. **Módulo 1 (`Defmatriz.java`):** Estructura y almacena la matriz de coeficientes $A$, el vector independiente $b$, el vector de aproximación inicial $X^{(0)} = [0, 0, 0]^T$ y la tolerancia $\varepsilon = 0.0001$.
2. **Módulo 2 (`MetodoJacobi.java` y `MetodoGaussSeidel.java`):** Contiene las funciones de cálculo numérico.
   - **Jacobi:** Utiliza un vector auxiliar para la actualización simultánea de variables.
   - **Gauss-Seidel:** Emplea actualización inmediata de variables dentro de la misma iteración.
3. **Módulo 3 (`MainJacobi.java` y `MainGaussSeidel.java`):** Clases principales de ejecución e impresión de resultados.

---

## Sistema de Ecuaciones Resuelto

$$5x + y + z = 7$$
$$x + 4y + z = 6$$
$$x + 2y + 5z = 8$$

---

## Compilación y Ejecución

### Desde Terminal / Consola (CLI)
1. Navega hasta la carpeta `src` del proyecto:
   ```bash
  
   cd src

   Compila todos los archivos .java:Bashjavac *.java
Ejecuta el Método de Jacobi:Bashjava MainJacobi
Ejecuta el Método de Gauss-Seidel:Bashjava MainGaussSeidel
Desde IntelliJ IDEAAbre el proyecto en IntelliJ.Abre la clase MainJacobi.java y haz clic en el botón Run ($\triangleright$).Abre la clase MainGaussSeidel.java y haz clic en el botón Run ($\triangleright$).
---

