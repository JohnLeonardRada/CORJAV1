package Practice;

public class RegForm1 {

	public static void main(String[] args) {
		System.out.println("\t\t\tInformation and Communications Technology Academy");
		System.out.println("\t\t7434 Yakal Street, Brgy. San Antionio, Makati City, Philippines");
		System.out.println("\t\t\t\tASSESSMENT/REGISTRATION FORM");
		System.out.println("\t-----------------------------------------------------------------------------------");
		System.out.println("	Stud. No.	: 201801141			 SY/SEM	: 2019-2020 First Term");
		System.out.println("	Name		: RADA, JOHN LEONARD MIÑANO ");
		System.out.println("	Address		: 129 D. Guadalupe St. Morning 	 Program/Major	: BSCSSE");
		System.out.println("			 Breeze Subd., Caloocan City	 Curriculum Code : 1819");
		System.out.println("\n	SECTION		 SUBJECT NAME		UNITS   DAY	TIME		  ROOM#");
		System.out.println("\t-----------------------------------------------------------------------------------");
		System.out.println("	SE21		Computer Architecture 	3.0	S	07:30AM-11:00AM	  906-N");
		System.out.println("			and Organization");
		System.out.println("	SE21		Computer Science  	3.0	W	07:30AM-11:00AM	  1008-N");
		System.out.println("			Elective 1");
		System.out.println("	SE21		Discrete Mathematics 	3.0	S	02:30PM-06:00PM	  903-N");
		System.out.println("	SE21		Information Management  3.0	W	02:30pM-06:00PM	  1005-N");
		System.out.println("			and Database System");
		System.out.println("	SE21		National Service 	3.0	S	11:00AM-02:30PM	  903-N");
		System.out.println("			Training Program 2");
		System.out.println("	SE21		Physcial Education 4 	2.0	W	11:00AM-01:30PM	  BBCOURT2");
		System.out.println("			(Team Sports) ");
		System.out.println("\t-----------------------------------------------------------------------------------");
		
		double tuitionFee = 32705.00;
		double laboratoryFee = 12600.00;
		double miscellaneousFee = 16430.00;
		double newStudent = 0.00;
		double fullPayment = tuitionFee + laboratoryFee + miscellaneousFee + newStudent;
		
		double tuitionFee2 = 35648.45;
		double laboratoryFee2 = 13734.00;
		double miscellaneousFee2 = 16430.00;
		double newStudent2 = 0.00;
		double installment = tuitionFee2 + laboratoryFee2 + miscellaneousFee2 + newStudent2;
		
		double downpayment = 32906.23;
		double firstInstallment = 6581.25;
		double secondInstallment = 6581.25;
		double thirdInstallment = 6581.25;
		double fourthInstallment = 6581.25;
		double fifthInstallment = 6581.25;
		
		double athleticFee = 530.00;
		double audioVisual = 1580.00;
		double energyFee = 3680.00;
		double guidance = 1050.00;
		double healthServices = 630.00;
		double idValidation = 110.00;
		double insurance = 110.00;
		double internet = 1580.00;
		double libraryFee = 1260.00;
		double learningMaterials = 1580.00;
		double registration = 530.00;
		double studentActivity = 1580.00;
		double studentDevelopmentFee = 1580.00;
		double studentOrganization = 420.00;
		double studentPublication = 210.00;
		double totalmiscellaneous = athleticFee + audioVisual + energyFee + guidance + healthServices + idValidation + insurance + internet + libraryFee + learningMaterials + registration + studentActivity + studentDevelopmentFee + studentOrganization + studentPublication;
		
		System.out.println("\n	ASSESSMENT SUMMARY				MISCELLANEOUS DETAIL ");
		System.out.println("\t\t\tFULLPAYMENT	INSTALLMENT ");
		System.out.println("\t   Tuition Fee      "	  +tuitionFee+	         "\t   "  +tuitionFee2+ 	   "\tAthletic Fee"		+ "\t\t   "     +athleticFee);
		System.out.println("\t   Labarotary Fee   "   +laboratoryFee+    	 "\t    " +laboratoryFee2+     "\tAudio Visual"		+ "\t\t  "      +audioVisual);
		System.out.println("\t   Miscellaneous    "   +miscellaneousFee+	 "\t    " +miscellaneousFee2+  "\tEnergy Fee"		+ "\t\t  "      +energyFee);
		System.out.println("\t   New Student\t        "	  +newStudent+       "\t        " +newStudent2+    "\tGuidance"		    + "\t\t  "     +guidance);
		System.out.println("\t\t\t    "  +fullPayment+	 "\t   "+installment+	                           "\tHealth Services"	+ "\t\t   "   +healthServices);
		System.out.println("\t\t\t\t\t\t\tId Validation"	                                                                 	+ "\t\t   "   +idValidation);
		System.out.println("\t DOWN PAYMENT"			   + "\t\t\t   "  +downpayment+    "	Insurance"	   	                + "\t\t   "   +insurance);
		System.out.println("\t 1st INSTALLMENT(7/32/2019)" + "\t    "  +firstInstallment+  "	Internet"		                + "\t\t  "    +internet);
		System.out.println("\t 2nd INSTALLMENT(8/15/2019)" + "\t    "  +secondInstallment+ "	Library Fee"		            + "\t\t  "    +libraryFee);
		System.out.println("\t 3rd INSTALLMENT(8/30/2019)" + "\t    "  +thirdInstallment+  "	Learning Materials"	            + "\t  "      +learningMaterials);
		System.out.println("\t 4th INSTALLMENT(9/13/2019)" + "\t    "  +fourthInstallment+ "	Registration"		            + "\t\t   "   +registration);
		System.out.println("\t 5th INSTALLMENT(9/27/2019)" + "\t    "  +fifthInstallment+  "	Student Activity"	            + "\t  "      +studentActivity);
		System.out.println("\t\t\t\t\t    "  +installment+	                               "    Student Development Fee"	    + "\t  "      +studentDevelopmentFee);
		System.out.println("\t\t\t\t\t\t\tStudent Organization"	                                                                + "\t   "     +studentOrganization);
		System.out.println("\t\t\t\t\t\t\tStudent Publication"	                                                                + "\t   "     +studentPublication);
		System.out.println("\t\t\t\t\t\t\tTotal"		  	                                                                    + "\t\t\t "   +totalmiscellaneous);
		System.out.println("");
		System.out.println("");
		
		System.out.println("\tOfficial Reciept Number/Date" + "  _____________");
		System.out.println("\tEnrollment Confirmed by");
		System.out.println("\t\t\t\t      _____________" + "	    ____________________________");
		System.out.println("\t\t\t\t\t\t\t\t     Registrar");
		System.out.println("\tNote: Class schedule is subject to change" + "   Generated 2019/07/09 15:26:51 jtlomanog");
		System.out.println("");
		System.out.println("\t   I shall abide by all existing rules and regulations of the School and those that " + 
		"\n\tmay be promulgated from time to time. I understand that the school has to collect " + 
		"\n\tmy personal data and I allow the school to process all my information and all" + 
		"\n\tpurposes related to this");
		System.out.println("\t\t\t\t\t\t\t    ____________________________");
		System.out.println("\t\t\t\t\t\t\t       Student Signature/Date");
		System.out.println("");
		System.out.println("\tPlease see reverse side for the policy on school charges and refund of fees");
	}

}
