/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 11:38:39 by kzak              #+#    #+#             */
/*   Updated: 2023/04/05 20:09:55 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int currentValue = scanner.nextInt();

		if (currentValue < 2) {
			scanner.close();
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

		boolean isPrime = true;
		int steps = 1;

		for (int i = 2; i <= Math.sqrt(currentValue); i++) {
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
