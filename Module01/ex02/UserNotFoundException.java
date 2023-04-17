/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UserNotFoundException.java                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 16:46:40 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 17:11:58 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex02;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String str) {
		super("\033[0;31m" + str + "\033[0m");
	}
}
