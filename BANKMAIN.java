package labtest2;

public class BANKMAIN {
	 public static void main(String[] args) {
		    BANKA bankA = new BANKA();
		    BANKB bankB = new BANKB();
		    BANKC bankC = new BANKC();

		    System.out.println("Balance in Bank A: " + bankA.getBalance());
		    System.out.println("Balance in Bank B: " + bankB.getBalance());
		    System.out.println("Balance in Bank C: " + bankC.getBalance());
		  }
}
