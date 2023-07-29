# conversor-de-moneda
  Este progrma permite al usuario seleccionar una opción y luego ingresar una cantidad a convertir. Después de ingresar la cantidad, se realizará la conversión correspondiente según la opción seleccionada y se mostrará el resultado.

A continuación, se detalla el funcionamiento del código paso a paso:
1. Se crea una instancia de la clase `ConversionesMoneda` llamada `cm`.

2. Se definen dos arreglos de objetos: `Moneda` y `Temperatura`, que contienen las opciones de conversión para moneda y temperatura, respectivamente.

3. Se inicia un bucle `while (true)` para mantener el programa en ejecución hasta que el usuario decida salir.

4. Se muestra un cuadro de diálogo de entrada (`JOptionPane.showInputDialog`) que muestra el menú de opciones de conversión. El usuario puede seleccionar una opción del menú o cancelar la operación.

5. Se verifica si el usuario cancela la operación o selecciona la opción "Salir" (a través del `opcion == null || opcion.toString().equalsIgnoreCase("Salir")`). En caso afirmativo, se muestra un mensaje "Programa Terminado" y el programa se cierra usando `System.exit(0)`.

6. Si el usuario no cancela y no selecciona "Salir", se inicia un bucle `do-while` para ingresar la cantidad a convertir. Se muestra un cuadro de diálogo de entrada para ingresar la cantidad. Si el usuario cancela, se muestra el mensaje "Programa Terminado" y el programa se cierra usando `System.exit(0)`.

7. Si el usuario ingresa un valor, se intenta convertirlo a `double`. Si la conversión es exitosa, se establece el valor convertido en la propiedad `valorcomun` de la instancia `cm` y se sale del bucle `do-while` con `break`.

8. Si ocurre una excepción `NumberFormatException`, significa que el valor ingresado no es un número válido. En este caso, se muestra un mensaje de error ("Error: Ingresa un número válido.") y el bucle `do-while` se repite para permitir que el usuario ingrese nuevamente una cantidad válida.

9. Luego, se verifica qué opción de conversión ha seleccionado el usuario: moneda o temperatura.

10. Si el usuario ha seleccionado "Conversor de Moneda," se muestra un cuadro de diálogo de selección (`JOptionPane.showInputDialog`) con las opciones de conversión de moneda. Después de que el usuario elige una opción, se realiza la conversión correspondiente utilizando los métodos `cm.dolar()`, `cm.Euros()`, etc., dependiendo de la opción seleccionada. Luego, se llama al método `cm.Confirmar()` para mostrar un mensaje con el resultado de la conversión.

11. Si el usuario ha seleccionado "Conversor de Temperatura," se muestra un cuadro de diálogo de selección con las opciones de conversión de temperatura. Después de que el usuario elige una opción, se realiza la conversión correspondiente utilizando los métodos `cm.CelciusaaFahrenheit()`, `cm.FahrenheitaKelvin()`, etc., dependiendo de la opción seleccionada. Luego, se llama al método `cm.Confirmar()` para mostrar un mensaje con el resultado de la conversión.

12. El bucle `while (true)` continúa ejecutándose hasta que el usuario elige "Salir" o cancela alguna de las selecciones en los cuadros de diálogo.
