package step2_ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CallATMWork {

	// 創建一個map存放銀行帳戶等資料
	Map bankAccount = new HashMap();

	// 按右鍵→Source→Generate Getters and Setters，會出現 public...get...../public void
	// set...
	// 然後再調整成自己所需的
	public Map getBankAccount(String accountStr) {
		// 指定輸入資料類型回傳類型，accountStr會是之後輸入的任意字串
		return (Map) bankAccount.get(accountStr);
	}

	public void setBankAccount(Map bankAccount) {
		this.bankAccount.put(bankAccount.get("account"), bankAccount);
		// 要將資料存入上方原建的Map中
	}

	public static void main(String[] args) {
		CallATMWork ca = new CallATMWork();
		boolean bo = true;
		Scanner input = new Scanner(System.in);

		// 跑迴圈
		while (bo) {
			// 當bo是ture時會一直輪迴迴圈
			System.out.println("please key in user:");
			String inputuser = input.next();

			Map tempMap = ca.getBankAccount(inputuser);
			// 隨便一變數從上方數據庫中取出使用者名稱對照

			// 假如 此值不等於無 代表數據庫有
			if (tempMap != null) {
				System.out.println("please choose function : 1.Withdrow 2.Deposit 3.Balance 4.Finsh ");
				String choice = input.next();
				// 確定不等於無，之後可先設定所有須取出的資料
				// Integer.parseInt(只能帶入字串 string); >功能: 把字串轉為數字 只能轉數字 不然就會抱錯
				String balanceStr = (String) tempMap.get("balance");
				int balance = Integer.parseInt(balanceStr);
				String password = (String) tempMap.get("password");

				if ("1".equals(choice)) {
					System.out.println("please key in withdrow how much money");
					int withdrowMoney = input.nextInt();

					if (withdrowMoney <= 0) {
						System.out.println("please key in again");
					} else if (withdrowMoney > balance) {
						System.out.println("you don't have that much money");
					}

					else if (withdrowMoney <= balance) {
						System.out.println("thank you");
						int huixuixui = balance - withdrowMoney;
						tempMap.put("balance", String.valueOf(huixuixui));
						ca.setBankAccount(tempMap);
						System.out.println("your balance : " + huixuixui);

					}

				} else if ("2".equals(choice)) {
					System.out.println("please key in deposit how much money");
					int depositMoney = input.nextInt();

					if (depositMoney <= 0) {
						System.out.println("please key in again");
					} else if (depositMoney > 0) {
						System.out.println("thank you");
						int newbalance = balance + depositMoney;
						// String.valueOf(要轉換的數字型態 ex.. int ??) > 把數字轉換成字串
						tempMap.put("balance", String.valueOf(newbalance));
						ca.setBankAccount(tempMap);
						System.out.println("your balance : " + newbalance);
					}

				} else if ("3".equals(choice)) {
					System.out.println("your balance :" + balance);

				}
				// 當選4時是結束，因此要結束迴圈，要將bo變成false，上方while才會停止
				else if ("4".equals(choice)) {
					bo = false;

				} else {
					System.out.println("please choose again");

				}

			} else {
				System.out.println("user isn't exist, please create !");

				Map newMap = new HashMap();

				System.out.println("please key in username:");
				String usernameStr = input.next();
				newMap.put("account", usernameStr);

				System.out.println("please key in password:");
				String passwordStr = input.next();
				newMap.put("password", passwordStr);

				System.out.println("please key in money:");
				String money = input.next();
				newMap.put("balance", money);

				System.out.println("Successfully created");
				System.out.println("New user name:" + usernameStr);
				System.out.println("New user password:" + passwordStr);
				System.out.println("Account balance:" + money);
				// 要記得把上方所有資訊存入最一開始建立的資料哩，就要set進去
				ca.setBankAccount(newMap);

			}
		}

		System.out.println("End!");

	}

}