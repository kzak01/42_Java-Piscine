/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 12:16:45 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 12:53:16 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex00;

import Module01.ex00.Transaction.TransferCategory;

public class Program {
	public static void main(String[] args) {
		User user1 = new User(1,"Lorenzo", 1000.0);
		User user2 = new User(2, "Michela", 2000.0);
		User user3 = new User(3, "Valerio", 500.0);
		
		System.out.println("User1: " + user1.getName()
					+ ", Balance: " + user1.getBalance());
		System.out.println("User2: " + user2.getName()
					+ ", Balance: " + user2.getBalance());
		System.out.println("User3: " + user3.getName()
					+ ", Balance: " + user3.getBalance());

		Transaction transaction = new Transaction(user1, user2,
				TransferCategory.DEBITS, 100.0);


		System.out.println("User1: " + user1.getName()
					+ ", Balance: " + user1.getBalance());
		System.out.println("User2: " + user2.getName()
					+ ", Balance: " + user2.getBalance());

		User user4 = new User(4, "Lorenzo", 200.0);
		System.out.println("User4: " + user4.getName()
		+ ", Balance: " + user4.getBalance());
	}
}



