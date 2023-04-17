/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 13:09:06 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 15:37:53 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex01;

public class Program {
	public static void main(String[] args) {
		User user1 = new User("Lorenzo", 300.0);
		User user2 = new User("Michela", 1000.0);

		System.out.println(user1);
		System.out.println(user2);

		User[] user = new User[5];
		for (int i = 0; i < 5; i++) {
			user[i] = new User("User_" + (i + 1), i * 20);
			System.out.println(user[i]);
		}
	}
}
