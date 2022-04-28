package com.material.bin;

public class Material {
	double volume;
	double weight;
	double costPerUnit;
	double totalCost;
	
	public Material(double volume,	double weight,	double costPerUnit,	double totalCost) {
		this.volume = volume;
		this.weight = weight;
		this.costPerUnit = costPerUnit;
		this.totalCost = totalCost;
	}
	
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	

}
