package programs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public abstract  class retry implements IRetryAnalyzer 
{
	
		private static final boolean False = false;
		int noofretry = 0;
		int maxretrycount = 4;
		public boolean retry(ITestResult result) 
		{
			if(!result.isSuccess())
			{
			
				if( noofretry < maxretrycount) 
				{
					result.setStatus(ITestResult.FAILURE);
					return true;
				}
				else {
					result.setStatus(ITestResult.FAILURE);
				}
			}
			else 
			{
				result.setStatus(ITestResult.SUCCESS);
			}
			return false;
		}
	}



