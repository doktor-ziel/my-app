package pl.acme.vip;

import pl.backlog.green.GeniusLibrary;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj promien kola: ");
		double radius = sc.nextDouble();
		double area = GeniusLibrary.calculateAreaOfCircle(radius);
		System.out.println("Pole kola o promieniu " + radius + " wynosi " + area);
	}
}