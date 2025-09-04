package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> readExcelFile(String fileName) {

		File xlsxFile = new File(System.getProperty("user.dir") + "\\testData\\" + fileName);
		XSSFWorkbook xssfWorkbook = null;
		XSSFSheet xssfSheet;
		List<User> userList = null;
		User user;
		Row row;
		Cell emailAdressCell;
		Cell passwordCell;
		Iterator<Row> rowIterator;
		try {
			xssfWorkbook = new XSSFWorkbook(xlsxFile);
			xssfSheet = xssfWorkbook.getSheet("LoginTestData");
			rowIterator = xssfSheet.iterator();
			rowIterator.next();
			userList = new ArrayList<User>();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				emailAdressCell = row.getCell(0);
				passwordCell = row.getCell(1);
				user = new User(emailAdressCell.toString(), passwordCell.toString());
				userList.add(user);
			}
			xssfWorkbook.close();

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userList.iterator();
	}
}
