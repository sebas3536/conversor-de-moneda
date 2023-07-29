/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversordemoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class ConversionesMoneda extends Funciones {

    public void Confirmar() {
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Menu", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (reply) {
            case JOptionPane.YES_OPTION:
                try {
                // double valor = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, this.conversiones, this.conversiones[0]));  
                //setValorcomun(valor);
            } catch (NumberFormatException ex) {
                setValorcomun(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad de Temperatura que deseas convertir:")));
            }
            break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                System.exit(0);
        }
    }

    public double dolar() {
        double dolar = this.getValorcomun() / 4000;
        showConvertedValue(dolar, "Dolares");
        return dolar;
    }

    public double Euros() {
        double Euros = this.getValorcomun() / 4.500;
        showConvertedValue(Euros, "Euros");
        return Euros;
    }

    public double LibrasEsterlinas() {
        double librasEsterlinas = this.getValorcomun() / 5.300;
        showConvertedValue(librasEsterlinas, "Libras Esterlinas");
        return librasEsterlinas;
    }

    public double YenJaponés() {
        double Yenjapones = this.getValorcomun() / 29.35;
        showConvertedValue(Yenjapones, "Yen Japonés");
        return Yenjapones;
    }

    public double Wonsulcoreano() {
        this.setValorExtranjero(this.getValorcomun() / 3.25);
        JOptionPane.showMessageDialog(null, "Tienes $" + getFormattedValue(getValorExtranjero()) + " Won sul coreano");
        return this.getValorExtranjero();
    }

    public double dolarPeso() {
        this.setValorExtranjero(this.getValorcomun() * 4000);
        showConvertedValue(getValorExtranjero(), "Pesos");
        return this.getValorExtranjero();
    }

    public double EurosPeso() {
        this.setValorExtranjero(this.getValorcomun() * 4.500);
        showConvertedValue(getValorExtranjero(), "Pesos");
        return this.getValorExtranjero();
    }

    public double LibrasEsterlinasPeso() {
        this.setValorExtranjero(this.getValorcomun() / 5.300 * 5.300);
        showConvertedValue(getValorExtranjero(), "Pesos");
        return this.getValorExtranjero();
    }

    public double YenJaponésPeso() {
        this.setValorExtranjero(this.getValorcomun() / 29.35 * 29.35);
        showConvertedValue(getValorExtranjero(), "Pesos");
        return this.getValorExtranjero();
    }

    public double WonsulcoreanoPeso() {
        this.setValorExtranjero(this.getValorcomun() / 3.25 * 3.25);
        showConvertedValue(getValorExtranjero(), "Pesos");
        return this.getValorExtranjero();
    }

    private void showConvertedValue(double value, String currency) {
        JOptionPane.showMessageDialog(null, "Tienes $" + getFormattedValue(value) + " " + currency);
    }

    private String getFormattedValue(double value) {
        // Formateamos el valor para mostrar solo 2 decimales
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }

    /*************************** TEMPERATURA ***************************/
    
    private void showResultWithFormattedValue(double value, String fromUnit, String toUnit) {
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedValue = df.format(value);
        JOptionPane.showMessageDialog(null, getValorcomun() + " " + fromUnit + " es igual a " + formattedValue + " " + toUnit);
    }

    public double CelciusaaFahrenheit() {
        double fahrenheit = this.getValorcomun() * 9 / 5 + 32;
        showResultWithFormattedValue(fahrenheit, "Celsius", "Fahrenheit");
        return fahrenheit;
    }

    public double FahrenheitaKelvin() {
        double kelvin = (this.getValorcomun() - 32) * 5 / 9 + 273.15;
        showResultWithFormattedValue(kelvin, "Fahrenheit", "Kelvin");
        return kelvin;
    }

    public double KelvinaRankine() {
        double rankine = this.getValorcomun() * 1.8;
        showResultWithFormattedValue(rankine, "Kelvin", "Rankine");
        return rankine;
    }

    public double RankineaCelcius() {
        double celsius = (this.getValorcomun() - 491.67) * 5 / 9;
        showResultWithFormattedValue(celsius, "Rankine", "Celsius");
        return celsius;
    }

    public double CelciusaKelvin() {
        double kelvin = this.getValorcomun() + 273.15;
        showResultWithFormattedValue(kelvin, "Celsius", "Kelvin");
        return kelvin;
    }

    public double FahrenheitaCelcius() {
        double celsius = (this.getValorcomun() - 32) * 5 / 9;
        showResultWithFormattedValue(celsius, "Fahrenheit", "Celsius");
        return celsius;
    }

}
