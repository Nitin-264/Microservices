package com.studyopedia;

import java.util.Scanner;

class Gusser{
	int a;
	public int a(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Gusser pls enter your number::\t");
		a= scan.nextInt();
		return a;
		
	}
}


class Player{
	int a;
	public int a(){
		Scanner scan = new Scanner(System.in);
		System.out.println("player pls enter your number::\t");
		a= scan.nextInt();
		return a;
		
	}
}

class Umpire{
	int G;
	int player1;
	int player2;
	int player3;
	
	public void CollectNumfromGusser() {
		Gusser G1=new Gusser();
		G=G1.a();
	}
	
	public void CollectNumfromPlayer1() {
		Player P1 =new Player();
		player1=P1.a();
		
		
		Player P2 =new Player();
		player2=P2.a();
		
		
		
		Player P3 =new Player();
		player3=P3.a();
		
	}
	
	void compare() {
		if(G==player1) {
			if(G==player2 && G==player3) {
				System.out.println("All player won the game\t");
				}
			else if (G==player2) {
				System.out.println("Player 1 player 2 won the game\t");
				
			}
			else if (G==player3) {
				System.out.println("player 1 and player3 won the game\t");
			}
			else {
				System.out.println("pllayer1 won the game");
			}
			}
		else if(G==player2) {
			if(G==player3) {
				System.out.println("Player 1 and player2 won the game\t");
				
			}
			else {
				System.out.println("player2 won the game\t");
			}
		}
		
		else if (G==player3) {
			System.out.println(" player3 won the game\t");
		}
		
		else {
			System.out.println("All player loos the game\t");
		}
	}
	
}

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start the game  \t");
		Umpire U= new Umpire();
		U.CollectNumfromGusser();
		U.CollectNumfromPlayer1();
		U.compare();
		
		System.out.println(" the is over  game\t");

	}

}
