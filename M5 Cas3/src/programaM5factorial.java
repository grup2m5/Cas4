/**
 * Podem veure el autor i la versió del <b>programa de M5</b>
 * @author grup2
 * @version 1.0
 */
public class programaM5factorial {
/**
 * Mostrar els parametres de calcular el factorial i el seu retorn
 * @param base
 * @return
 */
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
