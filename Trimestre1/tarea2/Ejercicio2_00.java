/*
 * Cuestiones previas 
 * Convertir euros a dolares
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/
package trimestre1.tarea2;
/*
a) i = 1 | Expresión: i >= 10

Resultado: Falso
Razonamiento: Sustituimos: 1 >= 10. 
Como 1 no es mayor ni igual a 10, la condición no se cumple.

b) i = 1 | Expresión: i > 0 && i < 10

Resultado: Verdadero
Razonamiento: Evaluamos ambas partes: 1 > 0 es Verdadero y 1 < 10 es Verdadero. 
Como es un AND (&&) y se cumplen ambas, es Verdadero.

c) i = 1 | Expresión: i > 0 && i > 10

Resultado: Falso
Razonamiento: 1 > 0 es Verdadero, pero 1 > 10 es Falso. Luego, es falso.


d) i = -1 | Expresión: i > 0 || i < 10

Resultado: Verdadero
Razonamiento: -1 > 0 es Falso, pero -1 < 10 es Verdadero. Al ser un OR (||),
basta con que una de las dos sea cierta.

e) i = 1, j = 10 | Expresión: i > 0 && i < 10 || j == 1

Resultado: Verdadero
Razonamiento: El && se evalúa primero: (1 > 0 && 1 < 10) da Verdadero.
Como es suficiente que una parte se cumpla, es verdadero.

f) i = 1 | Expresión: !(i == 1)

Resultado: Falso
Razonamiento: Primero evaluamos el paréntesis: (1 == 1) es Verdadero. 
El operador ! indica lo contrario, por lo que !(Verdadero) es Falso.

g) i = 1, j = 10 | Expresión: !(i == 10) && j == 10

Resultado: Verdadero
Razonamiento: (1 == 10) es Falso, al negarlo con ! se vuelve Verdadero. 
Por otro lado, 10 == 10 es Verdadero. Finalmente: Verdadero && Verdadero da Verdadero.

h) i = 1, j = 10 | Expresión: i > 2 || i < 10 && j == 10

Resultado: Verdadero
Razonamiento: la primera parte es falsa pero despues del (OR) es verdadera. 
Con que una parte del OR se cumpla, ya es verdadero. 

i) i = 1, j = 0, k = -1 | Expresión: i + k <= j - k * 3 && k >= 2

Resultado: Falso
Razonamiento: Resolvemos primero la aritmética. 1 + (-1) es 0. 0 - (-1)*3 es 0 - (-3) que es 3. 
Queda: 0 <= 3 && -1 >= 2. Verdadero && Falso, lo que da Falso.

j) i = 3, j = 2, k = -1 | Expresión: i == 3 || j <= 2 && k > 0

Resultado: Verdadero
Razonamiento: El && se evalúa antes: (j <= 2 && k > 0) -> (2 <= 2 && -1 > 0) -> Verdadero && Falso -> Falso. 
Ahora evaluamos el OR: (i == 3) Verdadero. Con que se cumpla una parte del (OR) ya es Verdadero.

k) i = 3, j = 2, k = -1 | Expresión: (i == 3 || j <= 2) && k > 0

Resultado: Falso
Razonamiento: Aquí los paréntesis fuerzan a que el OR se evalúe primero: 
(3 == 3 || 2 <= 2) -> Verdadero || Verdadero -> Verdadero. 
Ahora evaluamos el AND con la segunda parte: 
Verdadero && (-1 > 0) -> Verdadero && Falso da Falso.

l) año = 2020 | Expresión: año % 4 == 0

Resultado: Verdadero
Razonamiento: El operador % obtiene el resto de la división. 
2020 dividido entre 4 es exacto (505), por lo que el resto es 0. 
0 == 0 es Verdadero.

m) año = 2000 | Expresión: año % 4 == 0 && año % 100 != 0 || año % 400 == 0 
(Algoritmo de año bisiesto)

Resultado: Verdadero
Razonamiento: Evaluamos el AND primero: (2000 % 4 == 0 && 2000 % 100 != 0). 
2000 es divisible por 100, 2000 % 100 != 0 es Falso porque el resto si que es 0. 
Por tanto, la primera parte antes del OR queda en Falso (Verdadero && Falso -> Falso). 
Ahora la otra parte del OR: Falso || (2000 % 400 == 0), el resto es 0, asi que es Verdadero.
Con que se cumpla una de las dos partes del (OR) es suficiente.
*/