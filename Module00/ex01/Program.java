/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 11:38:39 by kzak              #+#    #+#             */
/*   Updated: 2023/04/05 18:31:35 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static int addPutNumber(int number, int plus) {
		boolean isNegative = false;

		if (number < 0) {
			isNegative = true;
			number = -number;
		}
		if (number >= 10) {
			plus = addPutNumber(number / 10, plus);
		}
		plus += number % 10;
		if (isNegative) {
			plus = -plus;
		}
		return plus;
	}

	public static void main(String[] argv) {
		Scanner	scanner = new Scanner(System.in);
		int		currentValue = scanner.nextInt();
		int		coffeCounter = 0;

		while (currentValue != 42) {
			if (currentValue < 1) {
				scanner.close();
				System.err.println("IllegalArgument");
				System.exit(-1);
			}

			int digitSum = addPutNumber(currentValue, 0);
			boolean isPrime = true;
	
			for (int i = 2; i <= Math.sqrt(digitSum); i++) {
				if (digitSum % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true)
				coffeCounter++;
			currentValue = scanner.nextInt();
		}

		scanner.close();
		System.out.println("Count of coffee - request -" + coffeCounter);
		System.exit(0);
	}
}
