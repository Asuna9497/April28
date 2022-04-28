package com.material.bin;



public class MaterialSet {
	
	private double diameter = 200;
	private double length = 400;
	

	public double getVolume() {
		double radius = diameter/2;	
		return 3.14*(radius*radius)*length;	
	}
	
	public double getWeight(double density) {
		
		
		double radius = diameter/2;	
		double vol = 3.14*(radius*radius)*length;
		return vol*density;
		
	}

	public double getMaterialCostPerUnit(double materialCost, double density) {
		double radius = diameter/2;	
		double vol = 3.14*(radius*radius)*length;
		double wt = vol*density;
		return wt*materialCost;
		
	}
	
	public double getTotalMaterialCost(double materlcost1, double materlcost2) {
		return  materlcost1*materlcost2;
		
	}


}
