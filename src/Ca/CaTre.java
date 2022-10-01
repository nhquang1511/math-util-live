package Ca;

public class CaTre extends Ca implements IBo {
	private double tocdo;
	public CaTre(String name, String mausac, double canang,double tocdo) {
		super(name, mausac, canang);
		// TODO Auto-generated constructor stub
		this.tocdo=tocdo;
	}

	@Override
	public void cachBo() {
		// TODO Auto-generated method stub
		System.out.println("bo nhu con bo");
	}

	@Override
	public void cachBoi() {
		// TODO Auto-generated method stub
		super.cachBoi();
		System.out.println("boi nhu ca tre");
	}

	@Override
	public void inThongtin() {
		// TODO Auto-generated method stub
		super.inThongtin();
		System.out.println("toc do bo: " + tocdo);
	}

}
