package com.DonationManagement.testUtils;

import java.io.File;

public class TestUtils {
	
	public static final String TEXT_RESET = "\033[0m";
	public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    
    public static int total;
    public static int passed;
    public static int failed;
    
	public static File businessTestFile;
	public static File boundaryTestFile;
	public static File exceptionTestFile;
	public static File xmlFile;
	static {
		total = 0;
		passed = 0;
		failed = 0;
		
		xmlFile = new File("./e-donation.xml");
		xmlFile.delete();
		
		businessTestFile = new File("./output_revised.txt");
		businessTestFile.delete();
		
		boundaryTestFile = new File("./output_boundary_revised.txt");
		boundaryTestFile.delete();
		
		exceptionTestFile = new File("./output_exception_revised.txt");
		exceptionTestFile.delete();
	}

	public static void testReport(){
		System.out.print("\n"  + BLUE_BOLD_BRIGHT + "TEST CASES EVALUATED : " + total + TEXT_RESET);
		System.out.print("\n"  + GREEN_BOLD_BRIGHT + "PASSED : " + passed + TEXT_RESET);
		System.out.println("\n"  + RED_BOLD_BRIGHT + "FAILED : " + failed + TEXT_RESET);
		
	}
}
