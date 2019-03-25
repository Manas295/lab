import java.util.HashMap;

public class GetCurrencyConversion {
	public static void main(String[] args) {

		String currency[] = {"INR","USD","POUND","AED","EURO"};
		int len = getLength(currency);
		System.out.println("Length "+len);
		
		 getRateofconversion(currency,len);
	}
	static int getLength(String arr[])
	{
		int count=0;
		for(String curr : arr)
		{
			count++;
		}
		return count;
	}
	static void getRateofconversion(String curr[] , int size)
	{
		int i=0,j=0;
		String currency1 = null, currency2=null;
		try {
			for(i=0;i<size;i++)
			{
				currency1 = curr[i];
				for(j=i+1;j<size;j++)
				{
					currency2 = curr[j];
					
					//Api Calling Method making it dummy one
					long rate = callThirdPartyApi(currency1,currency2);
					System.out.println("Conversion rate of "+currency1+" to "+currency2+" are : "+rate+" ");
					
					//Calling same for vice versa case so doing this iteration will be less
					rate = callThirdPartyApi(currency2,currency1);
					System.out.println("Conversion rate of "+currency2+" to "+currency1+" are : "+rate+" ");
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	
	
	static long callThirdPartyApi(String currencyFrom, String currencyTo)
	{
		
		//API CALLED AND DUMMY RESULT WILLB E RETURNED
		return 2000;
	}
}
