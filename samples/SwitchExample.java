package samples;

import java.util.ArrayList;

public class SwitchExample {

	public static void main(String[] args) {
		ArrayList<String> futuremonth= new ArrayList<String>();
		int month=6;
		switch (month)
		{
		case 1: futuremonth.add("Jan");
		case 2: futuremonth.add("Feb");
		case 3: futuremonth.add("Mar");
		case 4: futuremonth.add("Apr");
		case 5: futuremonth.add("May");
		case 6: futuremonth.add("Jun");
		case 7: futuremonth.add("Jul");
		case 8: futuremonth.add("Aug");
		case 9: futuremonth.add("Sep");
		case 10: futuremonth.add("Oct");
		case 11: futuremonth.add("Nov");
		case 12: futuremonth.add("Dec");
		break; // break is optional here
		}
		if (futuremonth.isEmpty())
		{
			System.out.println("invalid month");
		}
		else
		{
			for(int i=0;i<futuremonth.size();i++)
			{
				System.out.println(futuremonth.get(i));
			}
			/*for (String monthname:futuremonth)
			{
				System.out.println(monthname);
			}*/
		}

	}

}
