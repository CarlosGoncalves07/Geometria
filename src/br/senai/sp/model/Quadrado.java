package br.senai.sp.model;

public class Quadrado {

    public double lado1, lado2, area, perimetro;

    public double CalcularArea() {
        area = lado1 * lado2;
        return area;
    }

    public double CalcularPerimetro(){

        perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;



     }


    }
}
