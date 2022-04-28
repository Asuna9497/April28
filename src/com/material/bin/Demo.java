package com.material.bin;

import java.util.Scanner;

import com.material.dm.TotalCostEstimation;

public class Demo {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter set details:");
		
		String material1;
		
		String material2;
		
		String material3;
		
		int nbrOfUnits1;
		int nbrOfUnits2;
		int nbrOfUnits3;
		
		
		TotalCostEstimation totalCostEstimation = new TotalCostEstimation();
		
		
		
		System.out.println("enter material 1:");
		material1= sc.next();	
		System.out.println("enter nbr of units:");
		nbrOfUnits1= sc.nextInt();
		
		
		System.out.println("enter material 2:");
		material2= sc.next();	
		System.out.println("enter nbr of units:");
		nbrOfUnits2= sc.nextInt();
		
		System.out.println("enter material 3:");
		material3= sc.next();
		System.out.println("enter nbr of units:");
		nbrOfUnits3= sc.nextInt();
		
		
		MaterialFactory materialFactory = new MaterialFactory();
		
		double density1= materialFactory.getMaterialData(material1).getDensity();
		double cost1 = materialFactory.getMaterialData(material1).getCost();
		MaterialSet MaterialSet = new MaterialSet();
		double vol1= MaterialSet.getVolume();
		double wt1= MaterialSet.getWeight(density1);
		double cpu1 = MaterialSet.getMaterialCostPerUnit(cost1, density1);
		double totalMaterialCost1 =  MaterialSet.getTotalMaterialCost(cpu1, nbrOfUnits1);
		
		Material materialobj1 = new Material(vol1,wt1,cpu1, totalMaterialCost1);
		
		double density2=  materialFactory.getMaterialData(material2).getDensity();
		double cost2 = materialFactory.getMaterialData(material2).getCost();
		double vol2= MaterialSet.getVolume();
		double wt2= MaterialSet.getWeight(density2);
		double cpu2 = MaterialSet.getMaterialCostPerUnit(cost2, density2);
		double totalMaterialCost2 =  MaterialSet.getTotalMaterialCost(cpu2, nbrOfUnits2);
		
		Material materialobj2 = new Material(vol2,wt2,cpu2, totalMaterialCost2);
		
		double density3= materialFactory.getMaterialData(material3).getDensity();
		double cost3 = materialFactory.getMaterialData(material3).getCost();
		double vol3 = MaterialSet.getVolume();
		double wt3  = MaterialSet.getWeight(density3);
		double cpu3 = MaterialSet.getMaterialCostPerUnit(cost3, density3);
		double totalMaterialCost3 =  MaterialSet.getTotalMaterialCost(cpu3, nbrOfUnits3);
		
		Material materialobj3 = new Material(vol3,wt3,cpu3, totalMaterialCost3);
		
		double totalEstimate = totalMaterialCost1 + totalMaterialCost2+totalMaterialCost3;
		
		
		
		totalCostEstimation.saveTotalCost(materialobj1, totalEstimate, material1);
		

		totalCostEstimation.saveTotalCost(materialobj2, totalEstimate, material2);
		

		totalCostEstimation.saveTotalCost(materialobj3, totalEstimate, material3);
		
	}

}
