package Siniflar;

public class Cars {
	private String marka;
	private int model;
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public Cars(String marka, int model) {
		super();
		this.marka = marka;
		this.model = model;
	}
}
