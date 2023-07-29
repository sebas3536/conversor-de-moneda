package conversordemoneda;

import javax.swing.JOptionPane;

/* @author Sebastian*/
public class ConversorDeMoneda {

    public static void main(String[] args) {
        ConversionesMoneda cm = new ConversionesMoneda();

        Object[] Moneda = {
            "Convertir de Pesos a Dólar",
            "Convertir de Pesos a Euros",
            "Convertir de Pesos a Libras Esterlinas",
            "Convertir de Pesos a Yen Japonés",
            "Convertir de Pesos a Won sul-coreano",
            "Convertir de Dólar a Pesos",
            "Convertir de Euros a Pesos",
            "Convertir de Libras Esterlinas a Pesos",
            "Convertir de Yen Japonés a Pesos",
            "Convertir de Won sul-coreano a Pesos"

        };
        Object[] Temperatura = {
            "Convertir de Celcius a Fahrenheit",
            "Convertir de Fahrenheit a Kelvin",
            "Convertir de Kelvin a Rankine",
            "Convertir de Rankine a Celcius",
            "Convertir de Celcius a Kelvin",
            "Convertir de Fahrenheit a Celcius",};

        while (true) {
            Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, cm.conversiones, cm.conversiones[0]);

            if (opcion == null || opcion.toString().equalsIgnoreCase("Salir")) {
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                break;
            }
            do {
                String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir:");

                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    System.exit(0); // Salir del programa si el usuario cancela la operación
                }

                try {
                    double valorcomun = Double.parseDouble(input);
                    cm.setValorcomun(valorcomun);
                    break; // Salir del loop si el valor se pudo convertir correctamente
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
                }
            } while (true);

            if (opcion.toString().equalsIgnoreCase("Conversor de Moneda")) {
                Object selectedMoneda = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, Moneda, Moneda[0]);

                if (selectedMoneda instanceof String) {
                    String value = (String) selectedMoneda;
                    switch (value) {
                        case "Convertir de Pesos a Dólar":
                            cm.dolar();
                            break;
                        case "Convertir de Pesos a Euros":
                            cm.Euros();
                            break;
                        case "Convertir de Pesos a Libras Esterlinas":
                            cm.LibrasEsterlinas();
                            break;
                        case "Convertir de Pesos a Yen Japonés":
                            cm.YenJaponés();
                            break;
                        case "Convertir de Pesos a Won sul-coreano":
                            cm.Wonsulcoreano();
                            break;
                        case "Convertir de Dólar a Pesos":
                            cm.dolarPeso();
                            break;
                        case "Convertir de Euros a Pesos":
                            cm.EurosPeso();
                            break;
                        case "Convertir de Libras Esterlinas a Pesos":
                            cm.LibrasEsterlinasPeso();
                            break;
                        case "Convertir de Yen Japonés a Pesos":
                            cm.YenJaponésPeso();
                            break;
                        case "Convertir de Won sul-coreano a Pesos":
                            cm.WonsulcoreanoPeso();
                            break;
                        default:
                            break;
                    }
                    cm.Confirmar();
                }
            } else if (opcion.toString().equalsIgnoreCase("Conversor de Temperatura")) {
                Object selectedTemperatura = JOptionPane.showInputDialog(null, "Selecciona una opcion de Conversion", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, Temperatura, Temperatura[0]);
                if (selectedTemperatura instanceof String) {
                    String value = (String) selectedTemperatura;
                    switch (value) {
                        case "Convertir de Celcius a Fahrenheit":
                            cm.CelciusaaFahrenheit();
                            break;
                        case "Convertir de Fahrenheit a Kelvin":
                            cm.FahrenheitaKelvin();
                            break;
                        case "Convertir de Kelvin a Rankine":
                            cm.KelvinaRankine();
                            break;
                        case "Convertir de Rankine a Celcius":
                            cm.RankineaCelcius();
                            break;
                        case "Convertir de Celcius a Kelvin":
                            cm.CelciusaKelvin();
                            break;
                        case "Convertir de Fahrenheit a Celcius":
                            cm.FahrenheitaCelcius();
                            break;
                        default:
                            break;
                    }
                    cm.Confirmar();
                }
            }
        }
    }
}

/*

        

    }

}
 */
