/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 13:09:04 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 15:31:56 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex01;

public class User {
	private final int	identifier;
	private String		name;
	private double		balance;


	public User(String name, double balance) {
		this.identifier = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		if (balance > 0)
			this.balance = balance;
		else
			this.balance = 0.0;
	}

	public int getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		if (balance > 0)
			this.balance = balance;
		else
			this.balance = 0.0;
	}

	public String toString() {
		return "\033[0;34mUser name: \033[0m" + name
				+ "\nidentifier: " + identifier
				+ "\nbalance: " + balance;
	}
}
