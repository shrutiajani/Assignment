package automation.keywordframe;

import org.testng.annotations.Test;

public class KeywordTest {

@Test
public void runTest() throws Exception{

ExcelUtil.loadExcel();

KeywordEngine engine = new KeywordEngine();

int rows = ExcelUtil.getRowCount();

for(int i=1;i<rows;i++){

String keyword = ExcelUtil.getCellData(i,1);
String locator = ExcelUtil.getCellData(i,2);
String value = ExcelUtil.getCellData(i,3);

engine.performAction(keyword,locator,value);

}

}

}