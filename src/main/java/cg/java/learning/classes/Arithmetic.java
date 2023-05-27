package cg.java.learning.classes;

import cg.java.learning.exception.DivisionByZeroException;

import java.util.logging.Logger;

public class Arithmetic {
    private static  final Logger LOGGER = Logger.getLogger(Arithmetic.class.getName());

    public Double getSum(Double oper1, Double oper2){
        return oper1 + oper2;
    }

    public Double getQuot(Double oper1, Double oper2) throws DivisionByZeroException {
        Double result = null;
        if (oper2 == 0 ){
            throw  new DivisionByZeroException();
        }else {
          result = oper1 / oper2;
        }
        return result;
    }

    public Double getDiff(Double oper1, Double oper2){
        return oper1 - oper2;
    }

    public Double getProd(Double oper1, Double oper2){
        return oper1 * oper2;
    }

}
