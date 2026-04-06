package com.assignment_2;

class Cricketer
{
	String name;
	String country;
	int totMatches;
	
	//constructor
	Cricketer(){}
	Cricketer(String name, String country, int totMatches){
		this.name = name;
		this.country = country;
		this.totMatches = totMatches;
	}

	//printCricketerDetails()
	void printCricketerDetails(){
		System.out.println("Name : " + name + "\nCountry : " + country + "\ntotMactches : " + totMatches);
	}
}

class Batsman extends Cricketer
{
	int totRuns;
	//constructor()
	Batsman(String name, String country, int totMatches,int totRuns){
		super(String name, String country, int totMatches);
		this.totRuns = totRuns;
	}

	//printBatsmanDetails()
	void printBatsmanDetails(){
		System.out.println("Name : " + name + "\nCountry : " + country + "\nTotal Mactches : " + totMatches + "\nTotal Runs : " + totruns);
	}
}

class Bowler extends Cricketer
{
	int totWickets
	//constructor()
	Bowler(String name, String country, int totMatches, int totWickets){
		super(String name, String country, int totMatches);
		this.totWickets = totWickets;
	}	

	//printBatsmanDetails()
	void printBowlerDetails(){
		System.out.println("Name : " + name + "\nCountry : " + country + "\nTotal Mactches : " + totMatches + "\nTotal Runs : " + totruns + "\Total Wickets" : totWickets);

	}
}

class AllRounder extends Cricketer
{
	int totRuns;
	int totWickets;
	//constructor()
	AllRounder(String name, String country, int totMatches, int totRuns, int totWickets){
		super(String name, String country, int totMatches);
		this.totRuns = totRuns;
		this.totWickets = totWickets;
	}
	//printAllRounderDetails()
	void printAllRounderDetails(){
		System.out.println("Name : " + name + "\nCountry : " + country + "\nTotal Mactches : " + totMatches + "\nTotal Runs : " + totruns + "\Total Wickets" : totWickets);
	}
}




























public class CricketerDetailsInfo {

}
