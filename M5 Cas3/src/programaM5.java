import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programaM5 {
	
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
	
	
	// Mòdul potència aa
	public static int calcularPotencia(int base, int exponent) {
		int resultat = 1;
		if(base > 0){
			if(exponent > 0){
				for(int i=0;i < exponent; i++){
					resultat = resultat * base;
				}
			}
			else{
				resultat = 1;
			}
		}
		else if(base < 0){
			if(exponent > 0){
				for(int i=0;i < exponent; i++){
					resultat = resultat * base;
				}
			}
			else{
				resultat = 1;
			}
		}
		else{
				resultat = 0;
		}
		return resultat;
	}
	
	
	// Mòdul principal 2 vegades
	public static void main (String Args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int op1=0,op2=0,pos=-1;
		boolean correcte=true;
		String operacio = in.readLine();
		
		while (operacio!=null) {
		
		if (operacio.indexOf("^") >= 0) {
			pos = operacio.indexOf("^");
			if (pos==0 || pos==operacio.length()-1) {
				System.out.println("Error");
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
					System.out.println("Error");
				} else {
					System.out.println(calcularPotencia(op1,op2));
				}
			}
		} else if (operacio.indexOf("!") >= 0) {
			pos = operacio.indexOf("!");
			if (pos != operacio.length()-1) {
				System.out.println("Error");
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
					System.out.println("Error");
				} else {
					System.out.println(calcularFactorial(op1));
				}
			}
		} else {
			System.out.println("Error");
		}
		operacio = in.readLine();
		op1=op2=0;
		pos=-1;
		correcte=true;
		}
		System.exit(0);
	}
}
