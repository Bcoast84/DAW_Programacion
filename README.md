Aquí tienes el contenido completo y actualizado del `README.md` incorporando `trimestre2` y `trimestre3` a la estructura del repositorio y a la guía general:

```markdown
# Programación — CFGS Desarrollo de Aplicaciones Web (DAW)

Repositorio central de prácticas, tareas y proyectos desarrollados para el módulo profesional de **Programación** (CFGS DAW) en el IES Fernando Wirtz (A Coruña).

---

## 🛠️ Entorno y Herramientas

* **Lenguaje:** Java 21+ (OpenJDK / Eclipse Temurin)
* **Editor:** Visual Studio Code
* **Extensiones recomendadas:** *Extension Pack for Java* (Microsoft)
* **Control de versiones:** Git & GitHub

---

## 📂 Estructura del Repositorio

```text
DAW_Programacion/
├── .gitignore
├── README.md
├── trimestre1/
│   └── tarea1/          # Fundamentos, entrada/salida, condicionales y Math
├── trimestre2/          # POO avanzada, colecciones, excepciones y estructuras dinámicas (en progreso)
└── trimestre3/          # Persistencia, acceso a datos, interfaces gráficas y modularidad (en progreso)

```

---

## 📋 Trimestre 1 — Tarea 1: Fundamentos y Estructuras Secuenciales

Colección de ejercicios prácticos orientados al manejo de tipos primitivos, entrada de datos por teclado mediante `Scanner`, control de recursos con `try-with-resources`, formateo de salida con `printf` y operaciones numéricas seguras.

| Archivo | Descripción | Conceptos clave |
| --- | --- | --- |
| `Ejercicio1_1.java` | Operaciones aritméticas elementales y orden de precedencia. | Variables, tipos primitivos, operadores básicos |
| `Ejercicio1_2.java` | Desglose de importes, cálculo de IVA y costes derivados. | Entrada de datos, asignación, cálculos secuenciales |
| `Ejercicio1_3.java` | Conversión de unidades y magnitudes temporales/espaciales. | Operadores aritméticos, conversiones implícitas |
| `Ejercicio1_4.java` | Evaluación de expresiones lógicas y relacionales. | Operadores booleanos, sentencias condicionales simples |
| `Ejercicio1_5.java` | Estructuras de decisión simple para validación de datos. | `if-else`, control de flujo |
| `Ejercicio1_6.java` | Clasificación de rangos numéricos y condiciones compuestas. | Condicionales anidados, operadores lógicos `&&` y `||` |
| `Ejercicio1_7.java` | Cálculo del consumo medio de combustible (L/100 km). | Validación de entradas, control de coherencia, `printf` |
| `Ejercicio1_8.java` | Cálculo de la edad media de un conjunto de personas. | Variables acumuladoras, división real con `double` |
| `Ejercicio1_9.java` | Algoritmos de intercambio de variables con y sin variable auxiliar. | Asignación temporal, aritmética acumulada, operador XOR |
| `Ejercicio1_10.java` | Teorema de Pitágoras e hipotenusa de un triángulo rectángulo. | `Math.sqrt`, `Math.hypot`, precisión y prevención de *overflow* |

---

## 🚀 Compilación y Ejecución por Consola

Todos los archivos incluyen la cabecera correspondiente a su paquete (por ejemplo, `package trimestre1.tarea1;`). Para compilar y ejecutar desde una terminal situada en la raíz del proyecto (`DAW_Programacion/`):

### 1. Compilación

```bash
javac trimestre1/tarea1/Ejercicio1_10.java

```

### 2. Ejecución

```bash
java trimestre1.tarea1.Ejercicio1_10

```

> **Nota para VS Code:** Si ejecutas los archivos directamente con el botón de *Run / Debug*, asegúrate de tener abierta en el espacio de trabajo la carpeta raíz que contiene las carpetas `trimestreX` para que el servidor de lenguaje resuelva correctamente el *classpath*.

---

## 📌 Convenciones y Buenas Prácticas Aplicadas

* **Gestión de recursos:** Uso de sentencias `try-with-resources` para la instanciación de `Scanner`, garantizando el cierre automático del flujo `System.in` y previniendo fugas de memoria (*resource leaks*).
* **Precisión y formateo:** Salida de datos numéricos estructurada mediante `System.out.printf` con especificadores de precisión (`%.2f`, `%.4f`) y salto de línea portable (`%n`).
* **Seguridad numérica:** Empleo de funciones nativas como `Math.hypot` para evitar pérdidas de precisión (*underflow*) o desbordamiento (*overflow*) en operaciones con potencias intermedias.
* **Estándar de Git:** Control de versiones basado en *Conventional Commits* (`feat:`, `fix:`, `refactor:`, `chore:`, `docs:`) y exclusión estricta de binarios compilados y configuraciones locales vía `.gitignore`.

---

## 👤 Autor

* **Borja Costa Rojo** — *Desarrollo de Aplicaciones Web (DAW)*
* GitHub: [@Bcoast84](https://www.google.com/search?q=https://github.com/Bcoast84&utm_source=gemini)

```