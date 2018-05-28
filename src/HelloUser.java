import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		/* Uzrakstît programmu klasç HelloUser, kas
		1) Aicina lietotâju ievadît kâdu vârdu un uzvârdu vienâ rindâ ar atstarpi
	2) Sadala vârdu un uzvârdu divos mainîgajos.
	3) Vârdu pârveido tâ lai tas sâktos ar lielo burtu un visi pârçjie bûtu mazie burti
	4) Uzvârdu pârveido lai tas viss sastâvçtu no lielajiem burtiem
	5) Izvada uz ekrâna pârveidotot vârdu un uzvârdu, katru savâ rindiòâ ievietotu single
	quote pçdiòâs(')
	Hint: Lîdzîgi kâ String klases metode length() atgrieþ String garumu, tâ metode indexOf
	atgrieþ kâda noteikta simbola indeksu, kuru jau varam izmantot substring metodç.
	Tie kas vçlas iet dziïâk. Pievienojiet programmai gadîjumu apstrâdi, ja lietotâjs ievadot
	vârdu sâkumâ ievada atstarpi(vairâkas atstarpes), starp vârdu un uzvârdu ieliek vairâkas
	atstarpes, apskatiet gadîjumu, ja cilvçkam ir divi uzvârdi. Kïûdu apstrâde(ievada tikai vârdu)*/
		
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

	
