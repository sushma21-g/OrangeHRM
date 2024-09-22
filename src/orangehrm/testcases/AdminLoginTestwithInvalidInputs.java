package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidInputs 
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("", "");
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("System displaying expected error message for invalid data, Test Pass");
		}else
		{
			System.out.println("System not displaying expected error message for invalid data, Test Fail");
		}
		AppUtils.closeApp();
	}

}
