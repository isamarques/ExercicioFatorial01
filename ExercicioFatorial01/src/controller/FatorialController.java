package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int fatorial (int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num = num * fatorial (num - 1);
		}
	}
}