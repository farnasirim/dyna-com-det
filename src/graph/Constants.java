package graph;
/**
 * 
 * @author colonelmo
 * A class for handling the need of hard-coded materials
 * e.g. numerical constants, formulas , etc.
 */
public class Constants {
	
	public static class Numerical{
		static final Double LAMBDA ;
		static final Double THETA  ;
		static{
			LAMBDA = 0.;
			THETA = 1.0/(Math.exp(LAMBDA) - 1);
		}		
	}
	
	public static class Formulas{
		static Double UpdateEdgeWeight(Double oldWeight, int lastTimestamp, Double newWeight, int currentTimestamp ){
			return oldWeight*Math.exp(-Constants.Numerical.LAMBDA*((double)(currentTimestamp - lastTimestamp)))
					+ newWeight;
		}
	}
	
}
