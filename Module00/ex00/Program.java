/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 11:37:37 by kzak              #+#    #+#             */
/*   Updated: 2023/04/05 11:46:58 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Program {

	public static int addPutNumber(int number, int plus) {
		boolean isNegative = false;

		if (number < 0) {
			isNegative = true;
			number = Math.abs(number);
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
	// public static int addPutNumber(int number, int plus) {
	// 	if (number >= 10) {
	// 		plus = addPutNumber(number / 10, plus);
	// 	}
	// 	plus += number % 10;
	// 	return plus;
	// }
	
	public static void main(String[] args) {
		int number = -479598;
		int plus = addPutNumber(number, 0);

		System.out.println(plus);
		System.exit(0);
	}
}
