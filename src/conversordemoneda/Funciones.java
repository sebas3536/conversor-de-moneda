/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversordemoneda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class Funciones {

    private double Valorcomun;
    private double valorExtranjero;

    /**
     * *****************
     */
    Object[] conversiones = {
        "Conversor de Moneda",
        "Conversor de Temperatura"
    };

    /**
     * ******************
     * @return 
     */
    public double getValorExtranjero() {
        return valorExtranjero;
    }

    public void setValorExtranjero(double valorExtranjero) {
        this.valorExtranjero = valorExtranjero;
    }

    public double getValorcomun() {
        return Valorcomun;
    }

    public void setValorcomun(double Valorcomun) {
        this.Valorcomun = Valorcomun;
    }

}
