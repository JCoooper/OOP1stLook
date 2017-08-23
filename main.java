
/**
 * @author Jordan Cooper
 *
 */
public class main {

	public static void main(String[] args) {

		ID out1 = new ID(231, 654, 937);
		System.out.println("INFORMATION FOR IDs");
		out1.showAllID();

		SAL pay = new SAL(213, 331);
		System.out.println("INFORMATION FOR PAYCHECKS");
		pay.showPaycheck();

		HOUR time = new HOUR(7, 5, 9);
		System.out.println("INFORMATION FOR HOURS");
		time.showHours();

	}

}
