package com.xworkz.method.theater;

public class MovieHub{
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;


	public MovieHub(String theaterName,int totalTickets,String[] movieNames)
	{
		System.out.println("Created and init MovieHub ***************");
		System.out.println("arg 1" + theaterName);
		System.out.println("arg 2" + totalTickets);
		System.out.println("arg 3" + movieNames);
		this.movieNames=movieNames;
		this.theaterName=theaterName;
		this.totalTickets=totalTickets;
		System.out.println("Created and init MovieHub completed ***************");
	}

	public double bookTickets(String movieName,int noOfTickets,String bookedBy)
	{
		double totalPrice=0;
		System.out.println("invoked bookTickets");
		System.out.println("arg 1" + movieName);
		System.out.println("arg 2" + noOfTickets);
		System.out.println("arg 3" + bookedBy);
		return totalPrice;
	}


	public String[] getMovieNames() {
		return movieNames;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}


	}