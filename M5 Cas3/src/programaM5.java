import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Podem veure el autor i la versió del <b>programa de M5</b>
 * @author Grup2
 * @version 1.0
 * @docRoot
 */
public class programaM5 {
	
	private static final String FACTORIAL = "!";
	private static final String POTENCIA = "^";
/**
 * Visualitzem els parametres  i les seves exceptions
 * @param Args
 * @throws IOException
 */
	// Mòdul principal 2 vegades
	public static void main (String Args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int op1=0,op2=0,pos=-1;
		boolean correcte=true;
		String operacio = in.readLine();
	
		while (operacio!=null) {
		
		String error = "Error";
		if (operacio.indexOf(POTENCIA) >= 0) {
			pos = operacio.indexOf(POTENCIA);
			if (pos==0 || pos==operacio.length()-1) {
				System.out.println(error);
			} else {
				try{
					op1=Integer.parseInt(operacio.substring(0, pos));
					if (op1<-10 || op1>10) {
						correcte = false;
					}
				}catch(NumberFormatException e){
					correcte = false;
				}
				
				try{
					op2=Integer.parseInt(operacio.substring(pos+1, operacio.length()));
					if (op2<0 || op2>9) {
						correcte = false;
					}
				}catch(NumberFormatException e){
					correcte = false;
				}
				
				if (!correcte || (op1 == 0 && op2 == 0)){
					System.out.println(error);
				} else {
					System.out.println(programaM5potencia.calcularPotencia(op1,op2));
				}
			}
		} else if (operacio.indexOf(FACTORIAL) >= 0) {
			pos = operacio.indexOf(FACTORIAL);
			if (pos != operacio.length()-1) {
				System.out.println(error);
			} else {
				try{
					op1=Integer.parseInt(operacio.substring(0, pos));
					if (op1<0 || op1>12) {
						correcte = false;
					}
				}catch(NumberFormatException e){
					correcte = false;
				}
				if (!correcte){
					System.out.println(error);
				} else {
					System.out.println(programaM5factorial.calcularFactorial(op1));
				}
			}
		} else {
			System.out.println(error);
		}
		operacio = in.readLine();
		op1=op2=0;
		pos=-1;
		correcte=true;
		}
		System.exit(0);
	}
}
