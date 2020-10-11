
package ch.hsr.se1.calculator.logic;

import java.util.*;

import ch.hsr.se1.calculator.logic.operations.*;

public class RPNCalculator {
    private final LinkedList<Integer> stack = new LinkedList<>();
    private final Map<String, Operation> operations = new HashMap<>();

    public RPNCalculator() {
        final Operation[] operations =
                {
                        new FarhadMehtaPlus(),
                        new MichelMirsayyahMean(),
                        new ThomasZahnerBinomialCoefficient(),
                        new DanielFrickSubtraction(),
                        new PascalHoneggerCombinations(),
                        new ZvonimirSerkinicMultiplication(),
                        new PascalChristenSquare(),
                        new PascalGsellPow(),
                        new NathanaelGallGCD(),
                        new NicolasAndreaAlmyMedian(),
                        new JamieMaierModulus(),
                        new JariElmerLog2(),
                        new PascalKnechtSquareRoot(),
                        new MarcelJossPow(),
                        new TimonErhartCos(),
                        new DamianKalbererFactorial(),
                        new ZanettiMarcoDivision(),
                        new DavidKalchofnerMinValue(),
                        new LukasRibiLn(),
                        new ChristianRutzerSin(),
                        new MichaelBraendliTan(),
                        new JoelHirzelCubeRoot(),
                        new ManuelWeberNegate(),
                        new GianFluetschSignum(),
                        new LeandroCerianiArcSin(),
			            new PhilippEmmeneggerInc(),
			            new JoelSchalteggerDec(),
                        new JanisWolfRandomNumberBetween(),
                        new AllanKuengArcCos(),
			            new MartinezEven(),
			            new JonasKnuppATan(),
			            new JonasKnuppSin(),
	                    new JanisWolfRandomNumberBetween(),
	                    new SimonHagerNeg(),
	                    new SamuelLemmenmeierPlus1000(),
	                    new SamuelLemmenmeierPlus2000(),
	                    new IgorCetkovicUltimateCalculation(),
	                    new RafaelHangartnerMax(),
	                    new MarcEberhardFeuchtkugelTemp(),
                        new PascalKnechtLog10(),
                        new AndyPfisterToDegree(),
                        new FlorisStaubFactorial(),
                        new MathiasLenzExp(),
                        new LinardVincenzExponentiate(),
                        new GianBundiASin(),
                        new DominikCastelbergCrossTotal(),
                        new MariusZindelPower(),
                        new ManuelWeberAbs(),
			            new LuziaKuendigExp()
                };

        for (final Operation op : operations) {
            this.operations.put(op.getOperatorName(), op);
        }
    }

    public void push(final String character) throws OperationNotImplementedException, OperationException {
        if (operations.containsKey(character)) {
            final Operation operation = operations.get(character);
            final Integer result = operation.apply(stack);
            stack.push(result);
        } else {
            try {
                final Integer number = Integer.parseInt(character);
                stack.push(number);
            } catch (final NumberFormatException e) {
                throw new OperationNotImplementedException(character);
            }
        }
    }

    public Map<String, Operation> getOperations() {
        return operations;
    }

    public Integer[] getCurrentStack() {
        return stack.stream().toArray(Integer[]::new);
    }
}
