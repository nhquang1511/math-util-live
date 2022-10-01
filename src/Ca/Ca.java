package Ca;

public abstract class Ca implements IBoi {
	private String name;
	private String mausac;
	private double canang;
	

	public Ca(String name, String mausac, double canang) {
		this.name = name;
		this.mausac = mausac;
		this.canang = canang;
	}


	@Override
	public void cachBoi() {
		System.out.println("boi nhu ca");// TODO Auto-generated method stub
		
	}
	public void inThongtin() {
		System.out.println("ten ca: " + name);
		System.out.println("mau sac ca: " + mausac);
		System.out.println("can nang ca: "+ canang);
	}

}
