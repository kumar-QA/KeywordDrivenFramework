import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Script {

	@Test
	public void login() throws IOException, InterruptedException {
	ActionKeywords key=new ActionKeywords();
	FileInputStream fis = new FileInputStream("D:\\ExcelSheet\\KewordDrivenExcelSheet.xlsx");
	XSSFWorkbook wbo = new XSSFWorkbook(fis);
	XSSFSheet sh = wbo.getSheet("Sheet1");
	Row r;
	int rowc = sh.getLastRowNum();
	for (int i = 1; i <= rowc; i++) {
		r = sh.getRow(i);

		String runmode = r.getCell(1).getStringCellValue();

		if (runmode.equals("y")) {

			String action = r.getCell(0).getStringCellValue();

			if (action.equals("OpenBrowser")) {
				key.OpenBrowser();

			} else if (action.equals("EnterUrl")) {
				key.EnterUrl();
			} else if (action.equals("EnterUserName"))

			{
				key.EnterUserName();
			}

			else if (action.equals("EnterPassword")) {
				key.EnterPassword();

			}

			else if (action.equals("clickOnLogin")) {
				key.clickOnLogin();
			} else if (action.equals("clickonLogout")) {
				key.clickonLogout();
			}

			else if (action.equals("closeBrowser")) {
				key.closeBrowser();
			}
		}
	}

	
	
	
	
	
		
	}

}
