/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 18:45:00 by kzak              #+#    #+#             */
/*   Updated: 2023/04/12 11:43:01 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void	error_handler(Scanner scanner) {
		scanner.close();
		System.err.println("IllegalArgument");
		System.exit(-1);
	}

	public static void	getMinGrade(Scanner scanner, int[] minGrades, int currentWeek) {
		int	currentTest = 0;
		int	grade = 0;

		for (int i = 0; i < 5; i++) {
			grade = scanner.nextInt();
			if (grade < 1 || grade > 9)
				error_handler(scanner);
			if (currentTest == 0 || grade < minGrades[currentWeek])
				minGrades[currentWeek] = grade;
			currentTest++;
			}
	}

	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int[]	minGrades = new int[18];
		int		currentWeek = 0;

		while (true) {
			if (currentWeek == 18)
				break;
			String	week = scanner.next();
			if (week.equals("42"))
				break;
			else if (week.equals("Week")) {
				int	weekNbr = scanner.nextInt();
				if (weekNbr == currentWeek + 1) {
					getMinGrade(scanner, minGrades, currentWeek);
					currentWeek++;
				}
				else
					error_handler(scanner);
			}
			else
				error_handler(scanner);
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
