package automation.keywordframe;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {

static XSSFWorkbook workbook;
static XSSFSheet sheet;

public static void loadExcel() throws Exception{

FileInputStream fis = new FileInputStream(
System.getProperty("user.dir") + "/TestData/keywordData.xlsx");

workbook = new XSSFWorkbook(fis);
sheet = workbook.getSheet("Sheet1");

}

public static String getCellData(int row,int col){

return sheet.getRow(row).getCell(col).toString();

}

public static int getRowCount(){

return sheet.getPhysicalNumberOfRows();

}

}