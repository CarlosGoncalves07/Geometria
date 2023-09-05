package br.senai.sp.model;

public class Cadastro {
    public Quadrado CadastroQuadrado() {
        System.out.println("Informe o lado 1");
        objQuadrado.lado1 = teclado.nexDouble();
        System.out.println("Informe o lado 2");
        objQuadrado.lado2 = teclado.nexDouble();
        System.out.println("----------------");
        return objQuadrado;

    }

    public Triangulo CadastroTriangulo() {

        System.out.println("---Triangulo---");
        System.out.println("informe a Base");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Informe a Altura");
        objTriangulo.altura = teclado.nextDouble();
        System.out.println("-----------");

        return objTriangulo;
    }

    public Retangulo CadastroRetangulo() {
        System.out.println("---Retangulo---");
        System.out.println("Informe o lado1: ");
        objRetangulo.lado1 = teclado.nextDouble();
        System.out.println("Informe o lado2: ");
        objRetangulo.lado2 = teclado.nextDouble();
        System.out.println("----------------");
    }

    public Circulo CadastroCirculo() {
        System.out.println("---Circulo---");
        System.out.println("Informe o Raio");
        objCirculo.raio = teclado.nextDouble();
        System.out.println();
    }
}




