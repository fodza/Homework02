import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		/* Uzrakst�t programmu klas� HelloUser, kas
		1) Aicina lietot�ju ievad�t k�du v�rdu un uzv�rdu vien� rind� ar atstarpi
	2) Sadala v�rdu un uzv�rdu divos main�gajos.
	3) V�rdu p�rveido t� lai tas s�ktos ar lielo burtu un visi p�r�jie b�tu mazie burti
	4) Uzv�rdu p�rveido lai tas viss sast�v�tu no lielajiem burtiem
	5) Izvada uz ekr�na p�rveidotot v�rdu un uzv�rdu, katru sav� rindi�� ievietotu single
	quote p�di��s(')
	Hint: L�dz�gi k� String klases metode length() atgrie� String garumu, t� metode indexOf
	atgrie� k�da noteikta simbola indeksu, kuru jau varam izmantot substring metod�.
	Tie kas v�las iet dzi��k. Pievienojiet programmai gad�jumu apstr�di, ja lietot�js ievadot
	v�rdu s�kum� ievada atstarpi(vair�kas atstarpes), starp v�rdu un uzv�rdu ieliek vair�kas
	atstarpes, apskatiet gad�jumu, ja cilv�kam ir divi uzv�rdi. K��du apstr�de(ievada tikai v�rdu)*/
		
Scanner scanner = new Scanner(System.in);

	

		System.out.println("Ievadi savu vardu un uzvardu: ");		
		String vardsuzvards = scanner.next();
		
		
		String[] parts = vardsuzvards.split("-");
		String part1 = parts[0]; 
		String part2 = parts[1];
		
	
	   String part3 = part1.substring(0,1).toUpperCase() + part1.substring(1).toLowerCase();
	    
		System.out.println(part3);
		System.out.println(part2.toUpperCase());
	
		
		
		
		/*int idxOfNextWord = 0;
		for (int i = 0; i < vardsuzvards.length(); i++) {
		    if(vardsuzvards.charAt(i)==' ') {
		        System.out.println(vardsuzvards.substring(idxOfNextWord, i));
		        idxOfNextWord = i+1;
		    }            
		}
		
		String rez = vardsuzvards.substring(idxOfNextWord);
		System.out.println(rez.toUpperCase());
				
		System.out.println(vardsuzvards.substring(idxOfNextWord));
	        */
	        }
	}

	
