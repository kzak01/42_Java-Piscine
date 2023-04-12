/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/12 21:15:28 by kzak              #+#    #+#             */
/*   Updated: 2023/04/12 23:45:08 by kzak             ###   ########.fr       */
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
		int[]	frequencies = new int[10];

		getMaxOccurrences(unicodeBMP, mostFrequentChar, frequencies);

		if (frequencies[0] > 999) {
			scanner.close();
			System.err.println("Illegal Argument");
			System.exit(-1);
		}

		printHistogram(mostFrequentChar, frequencies);

		scanner.close();
		System.exit(0);
	}

	public static void	getMaxOccurrences(int[] unicodeBMP, char[] mostFrequentChar, int[] frequencies) {
		char	mostFrequentCharacter = ' ';
		int		maxFrequency = 0;
		int		position = 0;
		for (int i = 0; i < mostFrequentChar.length; i++) {
			for (int j = 0; j < unicodeBMP.length; j++) {
				if (unicodeBMP[j] > maxFrequency) {
					maxFrequency = unicodeBMP[j];
					mostFrequentCharacter = (char) j;
					position = j;
				}
			}
			frequencies[i] = unicodeBMP[position];
			mostFrequentChar[i] = mostFrequentCharacter;
			unicodeBMP[position] = 0;
			maxFrequency = 0;
		}
	}

	public static void	printHistogram(char[] mostFrequentChar, int[] frequencies) {
		int	maxFrequencyCount = frequencies[0];

		System.out.println();
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (frequencies[i] == maxFrequencyCount) {
				System.out.print(frequencies[i]);
				System.out.print("   ");
			}
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < 10; j++) {
				if (frequencies[j] * 10 / maxFrequencyCount >= i)
					System.out.print("#   ");
				if (frequencies[j] * 10 / maxFrequencyCount == i - 1) {
					if (frequencies[j] != 0) {
						System.out.print(frequencies[j]);
						if (frequencies[j] > 10)
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
