/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/12 21:15:28 by kzak              #+#    #+#             */
/*   Updated: 2023/04/12 23:37:55 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class Program {

	public static void	main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		String	inputString = scanner.nextLine();
		int[]	unicodeBMP = new int[65536];
	
		for (char c: inputString.toCharArray())
			unicodeBMP[c]++;
		
		char[]	mostFrequentChar = new char[10];
		int[]	unicodePositions = new int[10];

		getMaxOccurrences(unicodeBMP, mostFrequentChar, unicodePositions);

		if (unicodePositions[0] > 999) {
			scanner.close();
			System.err.println("Illegal Argument");
			System.exit(-1);
		}

		printHistogram(mostFrequentChar, unicodePositions);

		scanner.close();
		System.exit(0);
	}

	public static void	getMaxOccurrences(int[] unicodeBMP, char[] mostFrequentChar, int[] unicodePositions) {
		char	maxChar = ' ';
		int		maxCount = 0;
		int		position = 0;
		for (int i = 0; i < mostFrequentChar.length; i++) {
			for (int j = 0; j < unicodeBMP.length; j++) {
				if (unicodeBMP[j] > maxCount) {
					maxCount = unicodeBMP[j];
					maxChar = (char) j;
					position = j;
				}
			}
			unicodePositions[i] = unicodeBMP[position];
			mostFrequentChar[i] = maxChar;
			unicodeBMP[position] = 0;
			maxChar = ' ';
			maxCount = 0;
		}
	}

	public static void	printHistogram(char[] mostFrequentChar, int[] unicodePositions) {
		int	maxRepetition = unicodePositions[0];

		System.out.println();
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (unicodePositions[i] == maxRepetition) {
				System.out.print(unicodePositions[i]);
				System.out.print("   ");
			}
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < 10; j++) {
				if (unicodePositions[j] * 10 / maxRepetition >= i)
					System.out.print("#   ");
				if (unicodePositions[j] * 10 / maxRepetition == i - 1) {
					if (unicodePositions[j] != 0) {
						System.out.print(unicodePositions[j]);
						if (unicodePositions[j] > 10)
							System.out.print("  ");
						else
							System.out.print("   ");
					}
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(mostFrequentChar[i]);
			System.out.print("   ");
		}
		System.out.println();
	}
}
