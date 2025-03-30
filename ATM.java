public class ATM{
	public static void main(String[]args){
		double balance=1000.00;
		double withdrawamount=500.00;
		try{
			if(withdrawamount>balance){
				throw new Exception("Insufficient Balance");
			}
			balance=withdrawamount;
		 	System.out.println("Withdrawal sucessfull Remainingbalance:"+balance);
		}catch(Exception e){
			System.out.println("Error:"+ e.getMessage());
		}
	}
}
		