package Questao2;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public void inicializaNumero(double real, double imaginaria) {
        parteReal = real;
        parteImaginaria = imaginaria;
    }

    public void imprimeNumero() {
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }

    public boolean eIgual(NumeroComplexo outroNumero) {
        return parteReal == outroNumero.parteReal && parteImaginaria == outroNumero.parteImaginaria;
    }

    public NumeroComplexo soma(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = parteReal + outroNumero.parteReal;
        resultado.parteImaginaria = parteImaginaria + outroNumero.parteImaginaria;
        return resultado;
    }

    public NumeroComplexo subtrai(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = parteReal - outroNumero.parteReal;
        resultado.parteImaginaria = parteImaginaria - outroNumero.parteImaginaria;
        return resultado;
    }

    public NumeroComplexo multiplica(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = parteReal * outroNumero.parteReal - parteImaginaria * outroNumero.parteImaginaria;
        resultado.parteImaginaria = parteReal * outroNumero.parteImaginaria + parteImaginaria * outroNumero.parteReal;
        return resultado;
    }

    public NumeroComplexo divide(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        double divisor = Math.pow(outroNumero.parteReal, 2) + Math.pow(outroNumero.parteImaginaria, 2);
        resultado.parteReal = (parteReal * outroNumero.parteReal + parteImaginaria * outroNumero.parteImaginaria) / divisor;
        resultado.parteImaginaria = (parteImaginaria * outroNumero.parteReal - parteReal * outroNumero.parteImaginaria) / divisor;
        return resultado;
    }
}
