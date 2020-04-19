package food_nutrients;

import java.util.Scanner;

import entities.nutrientsData;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the amonut of foods will be registered:");
		int foodRow = input.nextInt();
		System.out.println("Enter the amount of nutrients will registered");
		int nutrientsColunms = input.nextInt();
		double [][] matrix = new double[foodRow][nutrientsColunms];
		nutrientsData data = new nutrientsData(foodRow,nutrientsColunms,matrix);
		data.createMatrix(foodRow, nutrientsColunms, matrix);
		printMatrix(data.getMatrix(),data.getRowNutrients(),data.getNutrientsColunms());
	

	}
	
	public static void printMatrix(double matrix[][],int matrixRow,int matrixColunms) {
		for(int i = 0; i<matrixRow; i++) {
			 for(int j = 0;j<matrixColunms;j++) {
				 System.out.print(" "+matrix[i][j]);
			 }
			 System.out.println();
		}
	}
}
