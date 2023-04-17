/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UserIdsGenerator.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 13:09:02 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 16:20:30 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex01;

public class UserIdsGenerator {
	private static 	UserIdsGenerator instance = null;
	private int				lastGeneratedId;

	private UserIdsGenerator() {
		this.lastGeneratedId = 0;
	}

	public static UserIdsGenerator getInstance() {
		if (instance == null)
			instance = new UserIdsGenerator();
		return instance;
	}

	public int generateId() {
		this.lastGeneratedId++;
		return this.lastGeneratedId;
	}

	public int getLastGeneratedId() {
		return lastGeneratedId;
	}
}
