package utils.test;

import org.junit.Test;

import com.crm.www.entity.Te1;
import com.crm.www.utils.ExcelUtil;

public class ExcelUtilTest {
	@Test
	public void testUtil() {
		ExcelUtil<Te1> excel = new ExcelUtil<>();
		Te1 t = new Te1();

		excel.getExcelFields(t);
		
	}
	
}
