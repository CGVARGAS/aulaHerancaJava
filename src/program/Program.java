package program;

import java.util.*;
import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List<Employee> list = new ArrayList<>();
			
			System.out.print("Qual a quantidade de funcionários: ");
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				System.out.printf("Employee #%d data: \n", i+1);
				System.out.printf("Outsourced (y/n)? ");
				char resp = sc.next().charAt(0);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				
				if(resp == 'y') {
					System.out.printf("Additional Charge: ");
					double additionalCharge = sc.nextDouble();
					Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
					list.add(emp);
				}else {
					Employee emp = new Employee(name, hours, valuePerHour);
					list.add(emp);
				}
				
			}
			System.out.println("  ");
			for(Employee emp : list) {
				System.out.println(emp);
			}
			sc.close();

	}

}
