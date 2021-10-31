package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();
		// instanciar uma lista para poder armazenar os dados dos elementos digitados
		// pelo usu�rio

		System.out.print("Enter the numbers of shape: ");
		int shapes = sc.nextInt();

		for (int i = 1; i <= shapes; i++) {
			System.out.println("Shape #" + i + " data: ");

			System.out.print("Rectangle or Circle (r/c)? ");
			char rc = sc.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED):  ");
			Color color = Color.valueOf(sc.next());
			// a palavra que o usuario digitar, sera convertida pra minha constante na
			// classe do tipo Enum Color

			if (rc == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();

				System.out.println("Height: ");
				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));

			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));
			}

		}
		
		System.out.println();
		System.out.println("Shape areas: ");
		
		for(Shape shape: list) {
			
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}
