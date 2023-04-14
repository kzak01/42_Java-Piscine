/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/14 12:40:35 by kzak              #+#    #+#             */
/*   Updated: 2023/04/14 12:40:37 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class User {
	private int		_id;
	private String	_name;
	private double	_balance;

	public User(int id, String name, double balance) {
		this._id = id;
		this._name = name;
		this._balance = balance;
	}

	public int getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public double getBalance() {
		return _balance;
	}

	public String toString() {
		return "User: id= " + _id +
				", name= " + _name +
				", balance= " + _balance + "\n";
	}
}
