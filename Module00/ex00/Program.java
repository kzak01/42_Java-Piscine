/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/05 11:37:37 by kzak              #+#    #+#             */
/*   Updated: 2023/04/05 20:08:15 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Program {
	public static void main(String[] args) {
		int	number = 479598;
		int	plus = 0;

		plus += number % 10;
		number /= 10;
		plus += number % 10;
		number /= 10;
		plus += number % 10;
		number /= 10;
		plus += number % 10;
		number /= 10;
		plus += number % 10;
		number /= 10;
		plus += number % 10;

		System.out.println(plus);
		System.exit(0);
	}
}
