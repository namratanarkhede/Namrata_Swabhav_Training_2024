package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class RegionCountryTest {
	public static void main(String[] args) {
		List<Region> regions = Arrays.asList(
				new Region(1,"Europe"),
				new Region(2, "Americas"),
				new Region(3, "Asia"),
				new Region(4, "Middle East and Africa")
		);
		List<Country> countries = Arrays.asList(
	            new Country("IT", "Italy", 1),
	            new Country("JP", "Japan", 3),
	            new Country("US", "United States of America", 2),
	            new Country("CA", "Canada", 2),
	            new Country("CN", "China", 3),
	            new Country("IN", "India", 3),
	            new Country("AU", "Australia", 3),
	            new Country("ZW", "Zimbabwe", 4),
	            new Country("SG", "Singapore", 3),
	            new Country("UK", "United Kingdom", 1),
	            new Country("FR", "France", 1),
	            new Country("DE", "Germany", 1),
	            new Country("ZM", "Zambia", 4),
	            new Country("EG", "Egypt", 4),
	            new Country("BR", "Brazil", 2),
	            new Country("CH", "Switzerland", 1),
	            new Country("NL", "Netherlands", 1),
	            new Country("MX", "Mexico", 2),
	            new Country("KW", "Kuwait", 4),
	            new Country("IL", "Israel", 4),
	            new Country("DK", "Denmark", 1),
	            new Country("HK", "HongKong", 3),
	            new Country("NG", "Nigeria", 4),
	            new Country("AR", "Argentina", 2),
	            new Country("BE", "Belgium", 1)
	        );
		
		System.out.println("1. get name of country from country code");
		String countryCode = "BE";
		countries.stream()
			.filter(country->country.getCode().equals(countryCode))
			.map(country->country.getName())
			.findFirst()
			.ifPresent(name-> System.out.println("The country name is: " +name));
		
		
		
		System.out.println("\n2. Get all countries in a region by region id");
		int regionId = 3;
		List<String> countriesRegion = countries.stream()
				.filter(country->country.getRegionId()== regionId)
				.map(country->country.getName())
				.collect(Collectors.toList());
		System.out.println("Country by region id : "+countriesRegion );
	
		
		System.out.println("\n3. find count of countries in each region");
		Map<Integer, Long> countryCountByRegion = countries.stream()
	            .collect(Collectors.groupingBy(Country::getRegionId, Collectors.counting()));
		
		countryCountByRegion.forEach((id, count) -> {
		    String regionName = regions.stream()
		        .filter(region -> region.getRegionId() == id)
		        .map(region->region.getName())
		        .findFirst()
		        .orElse("Not In List");
		    System.out.println("Region: " + regionName + "\t\tID: " + id + "\t\tCountry Count:  " + count );
		});
	}
	

}
