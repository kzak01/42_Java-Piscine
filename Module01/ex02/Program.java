/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 17:10:51 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 17:12:29 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex02;

public class Program {
	public static void main(String[] args) {
		UsersList usersList = new UsersArrayList();

		User user1 = new User("Michela", 1000.0);
		User user2 = new User("Valerio", 500.0);
		User user3 = new User("Lorenzo", 250.0);

		usersList.addUser(user1);
		usersList.addUser(user2);
		usersList.addUser(user3);

		System.out.println("\033[32m\n--Get User By Id--\033[0m");
		try {
			User foundUser = usersList.getUserById(2);
			System.out.println(foundUser);
		} catch (UserNotFoundException ex) {
			System.out.println(ex);
		}


		System.out.println("\033[32m\n--Error not existing Id--\033[0m");
		try {
			User foundUser = usersList.getUserById(10);
			System.out.println(foundUser);
		} catch (UserNotFoundException ex) {
			System.out.println(ex);
		}

		System.out.println("\033[32m\n--Get User By index--\033[0m");
		try {
			User foundUser = usersList.getUserByIndex(0);
			System.out.println(foundUser);
		} catch (UserNotFoundException ex) {
			System.out.println(ex);
		}

		System.out.println("\033[32m\n--Error not existing index--\033[0m");
		try {
			User foundUser = usersList.getUserByIndex(5);
			System.out.println(foundUser);
		} catch (UserNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
