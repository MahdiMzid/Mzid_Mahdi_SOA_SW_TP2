package service;

public class BanqueService {

	public double conversion(double montant)
	{
		return montant*3.36;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueService bs = new BanqueService();
		System.out.print(bs.conversion(2500));
	}
	

}
