/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 18:45:00 by kzak              #+#    #+#             */
/*   Updated: 2023/04/12 12:22:22 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void	error_handler(Scanner scanner) {
		scanner.close();
		System.err.println("IllegalArgument");
		System.exit(-1);
	}

	public static long	getMinGrade(Scanner scanner, int currentWeek) {
		int	currentTest = 0;
		int	grade = 0;
		int	minGrade = 0;

		for (int i = 0; i < 5; i++) {
			grade = scanner.nextInt();
			if (grade < 1 || grade > 9)
				error_handler(scanner);
			if (currentTest == 0 || grade < minGrade)
				minGrade = grade;
			currentTest++;
			}
		return minGrade;
	}

	public static long reverse(long minGrade) {
		long reverse = 0;
		while (minGrade > 0) {
			reverse = reverse * 10 + (minGrade % 10);
			minGrade /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		long	minGrades = 0;
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
					minGrades = minGrades * 10 + getMinGrade(scanner, currentWeek);
					currentWeek++;
				}
				else
					error_handler(scanner);
			}
			else
				error_handler(scanner);
		}

		scanner.close();
		long reverseMinGrades = reverse(minGrades);
		for (int i = 0; i < currentWeek; i++) {
			System.out.print("Week ");
			System.out.print(i + 1);
			System.out.print(" ");
			for (int j = 1; j <= reverseMinGrades % 10; j++)
				System.out.print("=");
			System.out.println(">");
			reverseMinGrades /= 10;
		}
		System.exit(0);
	}
}
