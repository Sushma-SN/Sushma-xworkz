package com.xworkz.method;
import java.util.Arrays;
import com.xworkz.method.theater.MovieHub;

public class MovieHubTester {

	public static void main(String[] args) {

				String[] movieNames= {"Sultan","KGF","BajiraoMastani"};
				
				MovieHub movieHub=new MovieHub("Navrang",500,movieNames);
                System.out.println(movieHub.getTheaterName());
                System.out.println(movieHub.getTheaterName());
                String convertedMovieNames=Arrays.deepToString(movieHub.getMovieNames());
                System.out.println(convertedMovieNames);
                 
                 movieHub.bookTickets("Sultan",5,"Sushma"); 
                 movieHub.bookTickets("KGF",495,"Sushma");
                 movieHub.bookTickets("KGF",495,"Sushma");
			}
	}
