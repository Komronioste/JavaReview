package com.neotech.Review10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {


		String filePath = System.getProperty("user.dir") + "\\extra + Excel.xlsx";
		FileInputStream fileIS = new FileInputStream(filePath);
		Workbook work = new XSSFWorkbook(fileIS);
		
		Sheet sh = work.getSheet("Sheet1");  //import .ss library. NOT .sl !!!
		
		Row row = sh.getRow(3);
		
		Cell cell = row.getCell(1);
		
		System.out.println(cell.toString());
		
		Row headerRow = sh.getRow(0);
		int cellNumber = headerRow.getLastCellNum();
		
		for (int c = 0; c < cellNumber; c++ )
		{
			System.out.print(row.getCell(c).toString() + " , ");
		}
		

	}

}
