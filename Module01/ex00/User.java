/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 11:53:19 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 12:48:17 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex00;

public class User {
	private int		identifier;
	private String	name;
	private double	balance;

	public User(int identifier, String name, double balance) {
		this.identifier = identifier;
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

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
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
}
