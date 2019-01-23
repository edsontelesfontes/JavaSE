package br.com.impacta.noturno.lambda;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

/**
 * Contem metodos utilitarios para manipulacao de arrays numericos (double)
 * 
 * @author Impacta Tecnologia
 * @version 1.0, 23 de set de 2016 - sandro.vieira - Implementacao.
 */
public class DoubleArrayUtils {

    /**
     * Aplica uma operacao numerica (DoubleUnaryOperator) sobre cada um dos elementos
     * de um array, retornando um array de mesmo tamanho com os valores resultantes
     * 
     * @param valores Array contendo o valores numericos
     * @param funcao Operacao numerica a ser aplicada nos valores
     */
    public static double[] transformaValores(double[] valores, DoubleUnaryOperator funcao) {
        double[] result = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            result[i] = funcao.applyAsDouble(valores[i]);
        }
        return result;
    }

    /**
     * Filtra um array numerico, retornando um novo array que contenha apenas
     * os elementos que sigam o criterio especificado
     * 
     * @param valores Array numerico a ser filtrado
     * @param criterio Criterio de filtragem
     */
    public static double[] filtraValores(double[] valores, DoublePredicate criterio) {

        double[] temp = new double[valores.length];
        int counter = 0;

        for (double val : valores) {
            if (criterio.test(val)) {
                temp[counter++] = val;
            }
        }

        double[] result = new double[counter];
        System.arraycopy(temp, 0, result, 0, counter);

        return result;
    }

    /**
     * Para cada elemento de um array numerico, executa o processo especificado.
     * @param valores Contem os valores numericos a serem processados
     * @param processo Processo a ser aplicado em cada valor numérico
     */
    public static void processaValores(double[] valores, DoubleConsumer processo) {
        for (double val : valores) {
            processo.accept(val);
        }
    }
}
