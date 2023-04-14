/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/14 12:40:18 by kzak              #+#    #+#             */
/*   Updated: 2023/04/14 12:40:32 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void	main(String[] args) {
		User user1 = new User(1, "Lorenzo", 300.0);
		User user2 = new User(2, "Valerio", 400.0);

		System.out.println(user1);
		System.out.println(user2);

		Transaction transaction = new Transaction(user2, user1, "debit", 100.0);

		System.out.println(transaction);
	}
}
