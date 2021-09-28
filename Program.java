package aplication;
import entities.Cadastro;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Cadastro cadastro;
		System.out.println("REGISTER YOUR ACCOUNT");
		System.out.print("Account number: ");
		int account= sc.nextInt();
		System.out.print("Full name: ");
		sc.nextLine();
		String nameHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit= sc.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter an initial deposit: ");
			double initialMoney= sc.nextDouble();
			cadastro= new Cadastro(account, nameHolder, initialMoney);
		}
		else {
			cadastro= new Cadastro(account, nameHolder);
		}
		System.out.printf("%nAccount data%n"+ cadastro+ "%n%n");
		
		System.out.print("Enter a deposit value: ");
		double numberToAdd = sc.nextDouble();
		cadastro.addMoney(numberToAdd);
		System.out.printf("Updated account data%n"+ cadastro + "%n%n");
		
		System.out.print("Enter a withdraw value: ");
		double numberToDiscount = sc.nextDouble();
		cadastro.withDraw(numberToDiscount);
		System.out.printf("Updated account data%n" + cadastro);
		
		sc.close();

	}

}
