package Entity;

import Interface.CalculatorService;

public class Calculator {
	CalculatorService service;
	
	
	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}

	public int add(int i, int j) {
		return service.add(i, j);
	}
	
	public int perform(int i, int j) {
		return (i+ j)*i;
	}
}
