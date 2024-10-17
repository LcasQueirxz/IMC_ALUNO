package main;

import entidades.Aluno;
import Utilidades.FuncoesUteis;

public class result {

    public static void main(String[] args) {
        // Criando um objeto da classe Aluno
        Aluno aluno = new Aluno("João Silva", "12345678901", 70.0, 1.75, 8.0, 80.0);

        // Testando o metodo verificarCpf
        boolean cpfValido = FuncoesUteis.verificarCpf(aluno.getCpf());
        System.out.println("CPF válido: " + cpfValido);

        // Testando o metodo calcularIMC
        double imc = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC: " + imc);

        // Testando o metodo avaliarAluno
        String resultadoAvaliacao = FuncoesUteis.avaliarAluno(aluno);
        System.out.println("Resultado da avaliação: " + resultadoAvaliacao);
    }
}
