/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsersList.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 16:13:12 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 16:38:54 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex02;

public interface UsersList {
	void addUser(User user);
	User getUserById(int id);
	User getUserByIndex(int index);
	int getNumberOfUsers();
}
