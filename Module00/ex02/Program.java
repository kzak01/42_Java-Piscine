/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 12:28:31 by kzak              #+#    #+#             */
/*   Updated: 2023/04/12 11:48:38 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static int addPutNumber(int number, int plus) {
		if (number >= 10) {
			plus = addPutNumber(number / 10, plus);
		}
		plus += number % 10;
		return plus;
	}

	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int currentValue = scanner.nextInt();
		int coffeCounter = 0;

		while (currentValue != 42) {
			if (currentValue < 1) {
				scanner.close();
				System.err.println("IllegalArgument");
				System.exit(-1);
			}
			int digitSum = addPutNumber(currentValue, 0);

			int		square = 1;
			while (square * square <= digitSum) {
				square++;
			}
			square--;

			boolean isPrime = true;
			for (int i = 2; i <= square; i++) {
				if (digitSum % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				coffeCounter++;
			currentValue = scanner.nextInt();
		}

		scanner.close();
		System.out.print("Count of coffee - request - ");
		System.out.println(coffeCounter);
		System.exit(0);
	}
}
