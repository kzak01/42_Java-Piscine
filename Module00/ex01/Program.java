/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/11 12:55:33 by kzak              #+#    #+#             */
/*   Updated: 2023/04/11 12:56:16 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void main(String[] argv) {
		Scanner	scanner = new Scanner(System.in);
		int		currentValue = scanner.nextInt();

		if (currentValue < 2) {
			scanner.close();
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

		int		square = 1;
		while (square * square <= currentValue) {
			square++;
		}
		square--;

		boolean	isPrime = true;
		int		steps = 1;
		for (int i = 2; i <= square; i++) {
			if (currentValue % i == 0) {
				isPrime = false;
				break;
			}
			steps++;
		}

		scanner.close();
		System.out.println(isPrime + " " + steps);
		System.exit(0);
	}
}
