package step2_ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CallATMWork {

	// �Ыؤ@��map�s��Ȧ�b�ᵥ���
	Map bankAccount = new HashMap();

	// ���k���Source��Generate Getters and Setters�A�|�X�{ public...get...../public void
	// set...
	// �M��A�վ㦨�ۤv�һݪ�
	public Map getBankAccount(String accountStr) {
		// ���w��J��������^�������AaccountStr�|�O�����J�����N�r��
		return (Map) bankAccount.get(accountStr);
	}

	public void setBankAccount(Map bankAccount) {
		this.bankAccount.put(bankAccount.get("account"), bankAccount);
		// �n�N��Ʀs�J�W���ت�Map��
	}

	public static void main(String[] args) {
		CallATMWork ca = new CallATMWork();
		boolean bo = true;
		Scanner input = new Scanner(System.in);

		// �]�j��
		while (bo) {
			// ��bo�Oture�ɷ|�@�����j�j��
			System.out.println("please key in user:");
			String inputuser = input.next();

			Map tempMap = ca.getBankAccount(inputuser);
			// �H�K�@�ܼƱq�W��ƾڮw�����X�ϥΪ̦W�ٹ��

			// ���p ���Ȥ�����L �N��ƾڮw��
			if (tempMap != null) {
				System.out.println("please choose function : 1.Withdrow 2.Deposit 3.Balance 4.Finsh ");
				String choice = input.next();
				// �T�w������L�A����i���]�w�Ҧ������X�����
				// Integer.parseInt(�u��a�J�r�� string); >�\��: ��r���ର�Ʀr �u����Ʀr ���M�N�|���
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
						// String.valueOf(�n�ഫ���Ʀr���A ex.. int ??) > ��Ʀr�ഫ���r��
						tempMap.put("balance", String.valueOf(newbalance));
						ca.setBankAccount(tempMap);
						System.out.println("your balance : " + newbalance);
					}

				} else if ("3".equals(choice)) {
					System.out.println("your balance :" + balance);

				}
				// ���4�ɬO�����A�]���n�����j��A�n�Nbo�ܦ�false�A�W��while�~�|����
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
				// �n�O�o��W��Ҧ���T�s�J�̤@�}�l�إߪ���ƭ��A�N�nset�i�h
				ca.setBankAccount(newMap);

			}
		}

		System.out.println("End!");

	}

}