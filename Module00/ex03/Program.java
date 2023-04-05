/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 18:45:00 by kzak              #+#    #+#             */
/*   Updated: 2023/04/05 19:38:46 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int[]	minGrades = new int[18];
		int		currentWeek = 0;
		int		currentTest = 0;
		int		grade = 0;

		while (true) {
			System.out.println("-> Week " + (currentWeek + 1));

			for (int i = 0; i < 5; i++) {
				grade = scanner.nextInt();

				if (grade == 42 || currentWeek == 18)
					break;
				if (grade < 1 || grade > 9) {
					scanner.close();
					System.err.println("IllegalArgument");
					System.exit(-1);
				}
				if (currentTest == 0 || grade < minGrades[currentWeek])
					minGrades[currentWeek] = grade;
				currentTest++;

				if (currentTest > 4) {
					currentWeek++;
					currentTest = 0;
				}
			}
			if (grade == 42 || currentWeek == 18)
				break;
		}

		scanner.close();
		for (int i = 0; i < currentWeek; i++) {
			System.out.print("Week " + (i + 1) + " ");
			for (int j = 1; j <= minGrades[i]; j++)
				System.out.print("=");
			System.out.println(">");
		}
		System.exit(0);
	}
}
