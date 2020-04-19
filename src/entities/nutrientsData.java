package entities;

import java.util.Scanner;

public class nutrientsData {
	Scanner input = new Scanner(System.in);
	private int rowNutrients;
	private int nutrientsColunms;
	private double [][] matrix;
	public nutrientsData(int rowNutrients, int nutrientsColunms, double[][] matrix) {
		this.rowNutrients = rowNutrients;
		this.nutrientsColunms = nutrientsColunms;
		this.matrix = matrix;
	}
	public void setMatrix(double [][]matrix) {
		this.matrix = matrix;
	}
	

	public double[][] getMatrix() {
		return matrix;
	}
	public int getRowNutrients() {
		return rowNutrients;
	}

	public void setRowNutrients(int rowNutrients) {
		this.rowNutrients = rowNutrients;
	}

	public int getNutrientsColunms() {
		return nutrientsColunms;
	}

	public void setNutrientsColunms(int nutrientsColunms) {
		this.nutrientsColunms = nutrientsColunms;
	}
	public void createMatrix(int rowNutrients, int nutrientsColunms,double [][]matrix) {
		for (int i = 0; i <rowNutrients;i++){
			for(int j = 0; j <nutrientsColunms;j++) {
				System.out.printf("Enter the amount of nutrients for food %d%n",i);
				matrix[i][j] = input.nextInt();
			}
		}
	}
	
}
