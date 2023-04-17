/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsersArrayList.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 16:17:35 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 17:14:32 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex02;

public class UsersArrayList implements UsersList {
	private User[] users;
	private int capacity = 10;
	private static final int GROWTH_FACTIOR = 2;
	private int size;

	public UsersArrayList() {
		users = new User[capacity];
	}

	public void addUser(User user) {
		if (size == capacity) {
			capacity *= GROWTH_FACTIOR;
			User[] newUsers = new User[capacity];
			for (int i = 0; i < capacity; i++)
				newUsers[i] = users[i];
			users = newUsers;
		}
		users[size++] = user;
	}

	public User getUserById(int id) {
		for (int i = 0; i < this.size; i++) {
			if (users[i].getIdentifier() == id)
				return users[i];
		}
		throw new UserNotFoundException("User with ID {" + id + "} not found");
	}

	public User getUserByIndex(int index) {
		if (index >= 0 && index < size && users[index] != null)
			return users[index];
		throw new UserNotFoundException("User at index {" + index + "} not found");
	}

	public int getNumberOfUsers() {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (users[i] != null)
				count++;
		}
		return count;
	}
}
