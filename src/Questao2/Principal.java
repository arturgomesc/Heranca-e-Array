package Questao2;

public class Principal {
    public static void main(String[] args) {
        NumeroComplexo numero1 = new NumeroComplexo();
        numero1.inicializaNumero(2.0, 3.0);
        numero1.imprimeNumero(); // Saída: 2.0+3.0i

        NumeroComplexo numero2 = new NumeroComplexo();
        numero2.inicializaNumero(4.0, 5.0);

        NumeroComplexo soma = numero1.soma(numero2);
        soma.imprimeNumero(); // Saída: 6.0+8.0i

        NumeroComplexo subtracao = numero1.subtrai(numero2);
        subtracao.imprimeNumero(); // Saída: -2.0-2.0i

        NumeroComplexo multiplicacao = numero1.multiplica(numero2);
        multiplicacao.imprimeNumero(); // Saída: -7.0+22.0i

        NumeroComplexo divisao = numero1.divide(numero2);
    }
}
