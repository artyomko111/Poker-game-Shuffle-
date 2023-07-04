package plus;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Hey {

	public static void main(String[] args) {

		String[] stringArrayNumb = new String[52];
		String[] stringArraySuits = new String[52];
		Collections.shuffle(Arrays.asList(suits(args)));
		Collections.shuffle(Arrays.asList(numbers(args)));
		for (int i = 0; i != stringArrayNumb.length; i++) {

			stringArrayNumb[i] = suits(args);
		}
		for (int j = 0; j != stringArraySuits.length; j++) {

			stringArraySuits[j] = numbers(args);
		}
		String[] a = stringArrayNumb;
		String[] b = stringArraySuits;
		int lowerBound = 0;
		int upperBound = stringArrayNumb.length;
		int range = upperBound - lowerBound;
		for (int c = 0; c < 1; c++) {
			int index = (int) (Math.random() * range) + lowerBound;
			{

				for (int d = 0; d < 1; d++) {
					int index1 = (int) (Math.random() * range) + lowerBound;
					{
						for (int e = 0; e < 1; e++) {
							int index2 = (int) (Math.random() * range) + lowerBound;
							{
								for (int f = 0; f < 1; f++) {
									int index3 = (int) (Math.random() * range) + lowerBound;
									{
										for (int g = 0; g < 1; g++) {
											int index4 = (int) (Math.random() * range) + lowerBound;
											{

												System.out.println(a[index] + " " + b[index]);
												System.out.println(a[index1] + " " + b[index1]);
												System.out.println(a[index2] + " " + b[index2]);
												System.out.println(a[index3] + " " + b[index3]);
												System.out.println(a[index4] + " " + b[index4]);
												/*
												 * b[index] = "4";
												 * b[index1] = "4";
												 * b[index2] = "4";
												 * b[index3] = "4";
												 * b[index4] = "JOKER";
												 * 
												 * a[index] = "Diamonds";
												 * a[index1] = "Hearts";
												 * a[index2] = "Hearts";
												 * a[index3] = "Hearts";
												 * a[index4] = "Hearts";
												 * System.out.println(a[index]+" "+b[index]);
												 * System.out.println(a[index1]+" "+b[index1]);
												 * System.out.println(a[index2]+" "+b[index2]);
												 * System.out.println(a[index3]+" "+b[index3]);
												 * System.out.println(a[index4]+" "+b[index4]);
												 */
											}
											// Royal Straight Flush
											for (int k = 0; a[index] == a[index1] & a[index1] == a[index2]
													& a[index2] == a[index3] & a[index3] == a[index4]; k++) {
												if (b[index] == "10" | b[index] == "J" | b[index] == "Q"
														| b[index] == "K" | b[index] == "A") {
													if (b[index1] == "10" | b[index1] == "J" | b[index1] == "Q"
															| b[index1] == "K" | b[index1] == "A") {
														if (b[index2] == "10" | b[index2] == "J" | b[index2] == "Q"
																| b[index2] == "K" | b[index2] == "A") {
															if (b[index3] == "10" | b[index3] == "J" | b[index3] == "Q"
																	| b[index3] == "K" | b[index3] == "A") {
																if (b[index4] == "10" | b[index4] == "J"
																		| b[index4] == "Q" | b[index4] == "K"
																		| b[index4] == "A") {
																	System.out.println("Royal Straight Flush");
																	break;

																}

															}
														}
													}
												}
												break;
											}
											// Straight Flush
											for (int k1 = 0; a[index] == a[index1] && a[index1] == a[index2]
													&& a[index2] == a[index3] && a[index3] == a[index4]; k1++) {
												if (b[index] == "9" | b[index] == "10" | b[index] == "J"
														| b[index] == "Q" | b[index] == "K") {
													if (b[index1] == "9" | b[index1] == "10" | b[index1] == "J"
															| b[index1] == "Q" | b[index1] == "K") {
														if (b[index2] == "9" | b[index2] == "10" | b[index2] == "J"
																| b[index2] == "Q" | b[index2] == "K") {
															if (b[index3] == "9" | b[index3] == "10" | b[index3] == "J"
																	| b[index3] == "Q" | b[index3] == "K") {
																if (b[index4] == "9" | b[index4] == "10"
																		| b[index4] == "J" | b[index4] == "Q"
																		| b[index4] == "K") {
																	System.out.println("Straight Flush");
																	break;
																}
															}
														}
													}
												}
												break;
											}
											// Four of a Kind
											for (int t = 0; b[index] == b[index1] & b[index1] == b[index2]
													& b[index2] == b[index3]
													| b[index] == b[index1] & b[index1] == b[index2]
															& b[index2] == b[index4]
													| b[index] == b[index1] & b[index1] == b[index3]
															& b[index3] == b[index4]
													| b[index] == b[index2] & b[index2] == b[index3]
															& b[index3] == b[index4]; t++) {
												System.out.println("Four of a kind");
												break;
											}
											// Full House

											if (b[index] == b[index1] & b[index1] == b[index2] & b[index3] == b[index4]
													|| b[index] == b[index1] & b[index1] == b[index4]
															& b[index3] == b[index2]
													|| b[index] == b[index1] & b[index2] == b[index3]
															& b[index3] == b[index4]
													|| b[index] == b[index3] & b[index3] == b[index4]
															& b[index1] == b[index2]
													|| b[index] == b[index2] & b[index2] == b[index4]
															& b[index3] == b[index1]
													|| b[index] == b[index1] & b[index2] == b[index3]
															& b[index3] == b[index4]
													|| b[index1] == b[index2] & b[index2] == b[index3]
															& b[index] == b[index4]) {
												System.out.println("Full House");

											}

											// Flush
											if (a[index] == a[index1]) {
												if (a[index1] == a[index2]) {
													if (a[index2] == a[index3]) {
														if (a[index3] == a[index4]) {
															System.out.println("Flush");

														}
													}
												}
											}
											// Straight
											if (b[index] == "2" & b[index1] == "4" & b[index2] == "5" & b[index3] == "6"
													& b[index4] == "7") {
												if (b[index] == "4" & b[index1] == "5" & b[index2] == "6"
														& b[index3] == "7" & b[index4] == "8") {
													if (b[index] == "5" & b[index1] == "6" & b[index2] == "7"
															& b[index3] == "8" & b[index4] == "9") {
														if (b[index] == "6" & b[index1] == "7" & b[index2] == "8"
																& b[index3] == "9" & b[index4] == "10") {
															if (b[index] == "7" & b[index1] == "8" & b[index2] == "9"
																	& b[index3] == "10" & b[index4] == "J") {
																if (b[index] == "8" & b[index1] == "9"
																		& b[index2] == "10" & b[index3] == "J"
																		& b[index4] == "Q") {
																	if (b[index] == "9" & b[index1] == "10"
																			& b[index2] == "J" & b[index3] == "Q"
																			& b[index4] == "K") {
																		if (b[index] == "10" & b[index1] == "J"
																				& b[index2] == "Q" & b[index3] == "K"
																				& b[index4] == "A") {
																			System.out.println("Straight");

																		}
																	}
																}
															}
														}
													}
												}
											}
											// Three of a Kind
											for (int t = 0; b[index] == b[index1] & b[index1] == b[index2] |
													b[index] == b[index1] & b[index1] == b[index4] |
													b[index] == b[index1] & b[index1] == b[index3] |
													b[index2] == b[index3] & b[index3] == b[index4] |
													b[index] == b[index3] & b[index3] == b[index4] |
													b[index1] == b[index3] & b[index3] == b[index4] |
													b[index1] == b[index2] & b[index2] == b[index4] |
													b[index] == b[index2] & b[index2] == b[index4] |
													b[index1] == b[index2] & b[index2] == b[index3] |
													b[index] == b[index2] & b[index2] == b[index3]; t++) {
												System.out.println("Three of a kind");
												break;
											}
											// Pair
											if (b[index] == b[index1] | b[index] == b[index2] | b[index] == b[index3]
													| b[index] == b[index4] |
													b[index1] == b[index] | b[index1] == b[index2]
													| b[index1] == b[index3] | b[index1] == b[index4] |
													b[index2] == b[index1] | b[index2] == b[index]
													| b[index2] == b[index3] | b[index2] == b[index4] |
													b[index3] == b[index1] | b[index3] == b[index]
													| b[index3] == b[index2] | b[index3] == b[index4] |
													b[index4] == b[index1] | b[index4] == b[index]
													| b[index4] == b[index3] | b[index4] == b[index2]) {

												System.out.println("Pair");
											}
											// High Card
											if (b[index] == "A" | b[index1] == "A" | b[index2] == "A" | b[index3] == "A"
													| b[index4] == "A") {

												System.out.println("High Card");
											}
											// Five of a Kind
											if (b[index] == b[index1] & b[index1] == b[index2] & b[index2] == b[index3]
													& b[index4] == "JOKER"
													|| b[index] == b[index1] & b[index1] == b[index2]
															& b[index4] == b[index2] & b[index3] == "JOKER"
													|| b[index] == b[index1] & b[index1] == b[index3]
															& b[index3] == b[index4] & b[index2] == "JOKER"
													|| b[index] == b[index2] & b[index2] == b[index3]
															& b[index3] == b[index4] & b[index1] == "JOKER"
													|| b[index1] == b[index2] & b[index2] == b[index3]
															& b[index3] == b[index4] & b[index] == "JOKER") {
												System.out.println("Five of a Kind");
											}

											// Two Pair-???
											/*
											 * int counter = 0;
											 * while(counter < 2) {
											 * if(b[index]==b[index1]|b[index]==b[index2]|b[index]==b[index3]|b[index]==
											 * b[index4]|
											 * b[index1]==b[index]|b[index1]==b[index2]|b[index1]==b[index3]|b[index1]==
											 * b[index4]|
											 * b[index2]==b[index1]|b[index2]==b[index]|b[index2]==b[index3]|b[index2]==
											 * b[index4] |
											 * b[index3]==b[index1]|b[index3]==b[index]|b[index3]==b[index2]|b[index3]==
											 * b[index4]|
											 * b[index4]==b[index1]|b[index4]==b[index]|b[index4]==b[index3]|b[index4]==
											 * b[index2]) {
											 * 
											 * System.out.println("Two Pair");
											 * 
											 * }
											 * 
											 * counter++;
											 * 
											 * 
											 * }
											 */

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static String suits(String[] args) {
		Random rd = new Random();
		String name[];
		int index;
		name = new String[4];
		name[0] = "Diamonds";
		name[1] = "Hearts";
		name[2] = "Clubs";
		name[3] = "Spades";
		index = rd.nextInt(4);

		// System.out.println(name[index]);
		return name[index];

	}

	public static String numbers(String[] args) {

		Random rd = new Random();
		String number[];
		int index;
		number = new String[13];
		number[0] = "2";
		number[1] = "4";
		number[2] = "5";
		number[3] = "6";
		number[4] = "7";
		number[5] = "8";
		number[6] = "9";
		number[7] = "10";
		number[8] = "J";
		number[9] = "Q";
		number[10] = "K";
		number[11] = "A";
		number[12] = "JOKER";

		index = rd.nextInt(13);

		// System.out.println(name[index]);
		return number[index];

	}

}
