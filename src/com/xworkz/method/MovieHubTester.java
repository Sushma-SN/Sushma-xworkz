package com.xworkz.method;

import java.util.Arrays;

import com.xworkz.method.theater.MovieHub;

public class MovieHubTester {

	public static void main(String[] args) {

				String[] movieNames= {"Sultan","KGF","BajiraoMastani"};
				
				MovieHub movieHub=new MovieHub("Navrang", 500, movieNames);
                System.out.println(movieHub.getTheaterName());
                System.out.println(movieHub.getTotalTickets());
                String convertedMovieNames=Arrays.toString(movieHub.getMovieNames());
                System.out.println(convertedMovieNames);
                
                double price = movieHub.bookTickets("KGF", 4, "Sushma");
                System.out.println("***************");
                //add logic for max 10 tickets
                movieHub.bookTickets("Sultan",495,"Sushma"); 
                movieHub.bookTickets("KGF",4,"X-workz");
           
			} 
	} 