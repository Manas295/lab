package b_foreach_test;

import java.util.ArrayList;
import java.util.List;

import a_default_static_method.SavingAccount;

public class TestIterable {

	public static void main(String[] args) { 
		
		List<SavingAccount> saving_accounts = new ArrayList<SavingAccount>();
		saving_accounts.add(new SavingAccount("Amit",4000));
		saving_accounts.add(new SavingAccount("Manoj",3670));
		saving_accounts.add(new SavingAccount("Joy",66782));
		saving_accounts.add(new SavingAccount("Herry",6788));
		
		saving_accounts.forEach(ac -> System.out.println(ac.getName()));
		
		System.out.println("test");
		/*
		@FunctionalInterface
		public interface Consumer<T>
		{
			void accept(T t);
		}
		*/
		
		saving_accounts.forEach(ob -> System.out.println(ob.getName()));
		
		//saving_accounts.forEach(ob ->System.out.println(ob));
		
		
		saving_accounts.forEach(ob ->{
			if(ob.getBal() > 4000)
			System.out.println(ob.getName());					
		}
		);
		
		
	}

}
