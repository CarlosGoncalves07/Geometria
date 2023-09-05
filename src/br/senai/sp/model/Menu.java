package br.senai.sp.model;

public class Menu {
    Cadastro objCadastro = new Cadastro();

    public void Menu() {
        System.out.println("---Sistema Geometria---");
        System.out.println("1 -Triangulo");
        System.out.println("2 - Circulo");
        System.out.println("3 - Retangulo");
        System.out.println("4 - Quadrado");
        System.out.println("-------------------------");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:


                Triangulo objTriangulo = objCadastro.CadastroTriangulo();
                objTriangulo.CalcularArea();
                objTriangulo.CalcularPerimetro();
                objExibir.ExibirTriangulo(objTriangulo);
                break;


            case 2:


                Circulo objCirculo = objCadastro.CadastroCirculo();
                objCirculo.CalcularArea();
                objTriangulo.CalcularPerimetro();
                objExibir.ExibirCirculo(objCirculo);
                break;

            case 3:

                Retangulo objRetangulo = objCadastro.CadastroRetangulo();
                objRetangulo.CalcularArea();
                objRetangulo.CalcularPerimetro();
                objExibir.ExibirRetangulo(objretangulo);
                break;

            case 4:

                Quadrado objQuadrado = objCadastro.CadastroQuadrado();
                objQuadrado.CalcularArea();
                objQuadrado.CalcularPerimetro();
                objExibir.ExibirQuadrado(objQuadrado);
                break;



