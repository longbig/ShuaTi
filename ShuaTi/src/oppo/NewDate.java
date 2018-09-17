package oppo;
/**
 * @date 2018年9月10日 下午7:41:27
 * @author 龙
 * 类描述：
 */
public class NewDate {
	
	private String country;
	private int year;
	private int month;
	private int day;
	
	private String[] American = {
		"","Jan","Feb","Mar","Apr","May","Jun",
		"Jul","Aug","Sep","Oct","Nov","Dec"
	};
	
	//将输入的数字日期提取出来
	private void exchange(String input) {
		String[] date = input.split("\\.");
		this.year = Integer.parseInt(date[0]);
		this.month = Integer.parseInt(date[1]);
		this.day = Integer.parseInt(date[2]);
	}
	
	//根据传参数的不同，构造不同的日期
	public NewDate(String dates, String countrys) {
		exchange(dates);
		//中国时间
		if(countrys.equals("cn")) {
			System.out.println(year + "年" + month + "月" + day + "日");
		}
		//美国时间
		if(countrys.equals("us")) {
			String dayUs = "";
			if(day == 1)
				dayUs = "1st";
			if(day == 2)
				dayUs = "2nd";
			if(day == 3)
				dayUs = "3rd";
			else
				dayUs = day + "th";
			
			System.out.println(American[month] + ". " + dayUs + ", " + year);
		}
	}
	
	public static void main(String[] args) {
		NewDate test1 = new NewDate("2018.8.1.", "cn");
		NewDate test2 = new NewDate("2018.8.1.", "us");
	}
}
