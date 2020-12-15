package com.xworkz.data;

import java.util.Arrays;
import java.util.Date;

import com.xworkz.data.dto.CountryDTO;

public class DTOCountryTetser {

	public static void main(String[] args) {
				
			String[] statesIndia= {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Goa","Gujarat","Haryana",
					"Himachal Pradesh","Jammu & Kashmir","Karnataka","Kerala","Madhya Pradesh","Maharashtra",
					"Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu",
					"Tripura","Uttar Pradesh","West Bengal","Chhattisgarh","Uttarakhand","Jharkhand","Telangana"};
			
			String[] langIndia= {"Kannada","Hindi","English","Bengali","Marathi","Telugu","Tamil","Gujarati","Urdu",
					"Malayalam","Punjabi","Kashmiri","Odia","Sanskrit","Nepali"};
			
			String[] statesUSA= { "Alabama", "Alaska,Alabama","Alaska","Arizona","Arkansas","California","Colorado",
					"Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","IllinoisIndiana","Iowa","Kansas",
					"Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi",
					"Missouri","MontanaNebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York",
					"North Carolina","North Dakota","Ohio","Oklahoma","Oregon","PennsylvaniaRhode Island",
					"South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington",
					"West Virginia","Wisconsin","Wyoming"};
					
			CountryDTO dto = new CountryDTO();
			System.out.println(dto.getName());
			System.out.println(dto.getStates());
 
			System.out.println("********************************");
			
			CountryDTO dto2 = new CountryDTO("India", 8984660981l);
			System.out.println(dto2.getName());
			System.out.println(dto2.getPopulation());
			
			System.out.println("********************************");
			
			
			CountryDTO dto3 = new CountryDTO("India", "Asia", statesIndia, 8984660981l, "Modi", "Ram Nath Kovind", langIndia);
			System.out.println(dto3.getName());
			System.out.println(dto3.getContinent());
			System.out.println(Arrays.toString(dto3.getStates()));
			System.out.println(dto3.getPopulation());
			System.out.println(dto3.getPrimeMinister());
			System.out.println(dto3.getPresident());
			System.out.println(Arrays.toString(dto3.getLanguages()));
			
			System.out.println("********************************");
			
			CountryDTO dto4 = new CountryDTO("USA", 9823567180l, "Trump");
			System.out.println(dto4.getName());
			System.out.println(dto4.getPopulation());
			System.out.println(dto4.getPresident());
			
			System.out.println("********************************");
			
			CountryDTO dto5 = new CountryDTO("USA", statesUSA, 9823567180l, "Trump");
			System.out.println(dto5.getName());
			System.out.println(Arrays.toString(dto5.getStates()));
			System.out.println(dto5.getPopulation());
			System.out.println(dto5.getPrimeMinister());
		}

	}



