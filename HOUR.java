
public class HOUR {

	int time1;
	int time2;
	int time3;

	public HOUR(int hour, int hour2, int hour3) {
		time1 = hour;
		time2 = hour2;
		time3 = hour3;

	}

	public void showHours() {

		System.out.println("The 1st person has " + time1 + " hours, But " + (time1 - 1) + " hours minus lunch break.");
		System.out.println("The 2nd person has " + time2 + " hours, But " + (time2 - 1) + " hours minus lunch break.");
		System.out.println("The 3rd person has " + time3 + " hours, But " + (time3 - 1) + " hours minus lunch break.");

	}

}
