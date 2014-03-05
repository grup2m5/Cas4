
public class programaM5factorial {

	// Mòdul factorial per canviar aa
	public static int calcularFactorial(int base) {
		int res = 1;
	    if (base == 0) {
	    	return 1;
	    } else {
			for (int i = base; i >= 1; i--) {
	            res *= i;
	        } 
	        return res;
	    }
	}

}
