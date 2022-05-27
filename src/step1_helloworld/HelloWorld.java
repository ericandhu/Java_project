package step1_helloworld;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		// 宣告變數
		// 字串練習
		// String a = "test";
		// String b = "20";
		// System.out.print(a + b + "\s");
		// System.out.print(a + b);

		// 數字練習
		// int c;
		// int d = 0;
		// System.out.println(d);
		// d = 5 + 4;
		// System.out.println(d);
		// c = 5 * 4;
		// System.out.println(c);
		// System.out.println((c + d) * 5);
		// System.out.println(d / 5);

//		// 小數點練習
//		double d = 6482.236789;
//		System.out.println("Double value: " + d);
//		// 單純印出前方文字
//		DecimalFormat df = new DecimalFormat("###.######");
//		// 整理狀態 命名代號 使用新方法時要使用 取小數點數值點後幾位
//		System.out.println("Rounded Double value (DecimalFormat): " + df.format(d));
//		// 公式命名代號.使用哪個方法
//
//		// 布林練習
//		boolean b = true;
//		System.out.println(b);
//		b = false;
//		System.out.println(b);
//
//		// 清單練習
//		List l = new ArrayList<>();
//		// ↑固定公式 宣告清單代號為 l 使用新的方法 → 甚麼東西都可以放"字串""數字"等等
//		List<String> strList = new ArrayList<String>();
//		// 清單<指定類型字串> 使用新的方法 要符合前面的型態 → 如上方涵式為僅限字串
//		List<Integer> inlist = new ArrayList<Integer>();
//		// 當清單要數值時不能輸int 要改輸int的封裝Integer
//		// 無法前後不一
//		strList.add("abc");
//		// 上面建立清單表格後，使用add增加清單內的內容
//		System.out.println(strList);
//		strList.add("dd");
//		System.out.println(strList);
//		strList.get(1);
//		// 清單建立後，如果要只取其中一個數值使用get，List內的排序為[0,1,2,3,4......]
//		System.out.println(strList.get(1));
//		inlist.add(1);
//		inlist.add(2);
//		inlist.add(23);
//		strList.add("bb");
//
//		// Map練習 key value
//		Map map = new HashMap();
//		// 固定公式
//		map.put("map1", strList);
//		// 在map中放各種資料 (key,value)
//		map.put("map2", inlist);
//		System.out.println("Map1: " + map.get("map1"));
//		System.out.println("Map2: " + map.get("map2"));
////		List fuck = (List) map.get("map1");
//		//從map取出資料後，指定型態以便使用，再做其他事情
//		//System.out.println("Map.getList: " + fuck.get(1));

		// if else練習
//		String str1 = "str";
//		String str2 = "str";
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		// equals(比較)[一般來說字串用打字的，數值用==
//		String str3 = new String("str");
//		String str4 = new String("str");
//		//         記憶體位置與上方的不同 因此無法檢查是否相同
//		System.out.println(str3 == str4);
//		
//		String str1 ="輝輝輝";
//		String str2="喝到飽";
//		//若 str1等於某個字串
//		if ("輝輝輝".equals(str1)) {
//			System.out.println("str1 is hui hui hui");
//		}
//		//或 str2等於某個字串
//		else if ("喝到飽".equals(str2)) {
//			System.out.println("str2 is all you can dink");
//		}
//		//若 非上述兩種的話
//		else {
//			System.out.println("oh no is wrong");
//		}
//		
//		//if else 實際運用(一次性的)
//		Scanner sss = new Scanner(System.in);
//		System.out.println("請輸入比較字串：");
//		String input = sss.next();
//		//                 有這個就是會讓下方可以打綠字
//		//反正就是輸入東西，下面會跑出是否符合接下來設定的東西
//		//若 輸入字串等於設定值
//		if ("沒雨".equals(input)) {
//			System.out.println("今天 可以 出門");
//		}
//		else if ("有雨".equals(input)) {
//			System.out.println("今天 不宜 出門");
//		}
//		else {
//			System.out.println("請看窗戶看天氣");
//		}

		
		
		
		
		
		// 某一種小數位數值
		// BigDecimal big = BigDecimal.ZERO;
		// BigDecimal multiply = new BigDecimal("2.5");
		// big = big.multiply(multiply);
		// System.out.println(big);

	}

}
