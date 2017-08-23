public class SAL {

	int P1;
	int P1BO;
	int P2;
	int P2BO;

	public SAL(int pa1, int pa2) {
		P1 = pa1;
		P2 = pa2;

		P1BO = P2 * 7;
		P2BO = P1 * 6;

	}

	public void showPaycheck() {

		System.out.println("The 1st person has a paycheck of $" + P1 + ", But $" + P1 * P1BO + " with the bonus.");
		System.out.println("The 2nd person has a paycheck of $" + P2 + ", But $" + P2 * P2BO + " with the bonus.");
		System.out.println();

	}

}
