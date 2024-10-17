package Utilidades;

import entidades.Aluno;

public class FuncoesUteis {

    // Metodo para verificar CPF (simplificado)
    public static boolean verificarCpf(String cpf) {
        // Verificacao basica de tamanho e digitos
        return cpf != null && cpf.matches("\\d{11}");
    }

    // Metodo para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    // Metodo para avaliar o aluno
    public static String avaliarAluno(Aluno aluno) {
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
