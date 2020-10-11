package ch.hsr.se1.calculator.logic.operations;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AllanKuengDecr implements Operation {

	    public static final String OPERATOR = "AllanKuengDecr";
	    public static final String HELP = "Returns decrement of an integer. Example: 12 = 11";

	    public String getOperatorName() {
	        return AllanKuengDecr.OPERATOR;
	    }

	    public String getHelp() {
			return AllanKuengDecr.HELP;
	    }

	    public Integer apply(LinkedList<Integer> operands) throws OperationException {
	        try {
	        	int num = operands.pop();
				return Math.decrementExact(num);
	        } catch(NoSuchElementException e) {
	            throw new NotEnoughNumbersForOperationException();
	        }
	    }
	}
