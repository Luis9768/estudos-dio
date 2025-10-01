package luis.Desafios.DesafioConcessionaria;

import java.util.Scanner;

public class VendaDoVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaracteristicasDoVeiculo carro01 = new CaracteristicasDoVeiculo();


        carro01.marcaDoCarro = "CHEVROLET";
        carro01.anoDeFabricacao = 2010;
        carro01.nomeDoCarro = "Cobalt";
        carro01.tipoDoCarro = "Sedan";
        carro01.motorDoCarro = 2.0;
        carro01.quantidadeDePortas = 4;
        carro01.quantidadeDeLugares = 5;
        carro01.valorDoVeiculo = 37.000f;

        CaracteristicasDoVeiculo carro02 = new CaracteristicasDoVeiculo();
        carro02.marcaDoCarro = "BMW";
        carro02.anoDeFabricacao = 2021;
        carro02.nomeDoCarro = "320i";
        carro02.tipoDoCarro = "Sedan";
        carro02.motorDoCarro = 3.0;
        carro02.quantidadeDePortas = 2;
        carro02.quantidadeDeLugares = 2;
        carro02.valorDoVeiculo = 97.000f;

        CaracteristicasDoVeiculo carro03 = new CaracteristicasDoVeiculo();

        carro03.marcaDoCarro = "Mercedes";
        carro03.anoDeFabricacao = 2018;
        carro03.nomeDoCarro = "GLA 200";
        carro03.tipoDoCarro = "SUV";
        carro03.motorDoCarro = 3.0;
        carro03.quantidadeDePortas = 4;
        carro03.quantidadeDeLugares = 5;
        carro03.valorDoVeiculo = 134.000f;

        carro01.valorDoVeiculo = carro01.valorDoVeiculo * 0.1f;
        carro02.valorDoVeiculo = carro02.valorDoVeiculo * 0.1f;
        carro03.valorDoVeiculo = carro03.valorDoVeiculo * 0.1f;
        int menu = 0;
        switch (menu) {
            case 1:
                System.out.println("Digite 1 para abrir o cadastro de carros");
                CaracteristicasDoVeiculo cadastroCarro = new CaracteristicasDoVeiculo();
                cadastroCarro.marcaDoCarro = scanner.next();
                cadastroCarro.anoDeFabricacao = scanner.nextInt();
                cadastroCarro.nomeDoCarro = scanner.next();
                cadastroCarro.tipoDoCarro = scanner.next();
                cadastroCarro.motorDoCarro = scanner.nextDouble();
                cadastroCarro.quantidadeDePortas = scanner.nextInt();
                cadastroCarro.quantidadeDeLugares = scanner.nextInt();
                cadastroCarro.valorDoVeiculo = scanner.nextFloat();
                System.out.println("Oferta do dia: " + cadastroCarro.marcaDoCarro + " " + cadastroCarro.nomeDoCarro +
                        ", motor " + cadastroCarro.motorDoCarro + ", " + cadastroCarro.quantidadeDePortas + " portas, " +
                        cadastroCarro.quantidadeDeLugares + " lugares, por apenas R$" + cadastroCarro.valorDoVeiculo +
                        ". Não perca essa oportunidade!!!");
                    break;
            case 2:


        }
    }


}
