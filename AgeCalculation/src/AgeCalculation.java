import javax.swing.JOptionPane;

public class AgeCalculation {

	public static void main(String[] args) {
		String dob = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
		JOptionPane.showMessageDialog(null, "Your birthday is " + dob);
		
		String birthMonth = dob.substring(0, 2);
		String birthDay = dob.substring(3, 5);
		String birthYear = dob.substring(6, 10);
		
		int birthMonthNum = Integer.parseInt(birthMonth);
		int birthDayNum = Integer.parseInt(birthDay);
		int birthYearNum = Integer.parseInt(birthYear);
		
		if (birthMonthNum > 12 || birthDayNum > 31 || birthYearNum > 2021) {
			 System.out.println("You have entered an invalid birthday");
			 System.exit(0);
			}
		
		String current = JOptionPane.showInputDialog("Enter the current day (MM/DD/YYYY):");
		JOptionPane.showMessageDialog(null, "The current date is " + current);
		
		String currentMonth = current.substring(0, 2);
		String currentDay = current.substring(3, 5);
		String currentYear = current.substring(6, 10);
		
		
		int currentMonthNum = Integer.parseInt(currentMonth);
		int currentDayNum = Integer.parseInt(currentDay);
		int currentYearNum = Integer.parseInt(currentYear);
		
		if (currentMonthNum > 12 || currentDayNum > 31 || currentYearNum > 2021) {
			 System.out.println("You have entered an invalid birthday");
			 System.exit(0);
			}
		
		int ageYears = currentYearNum - birthYearNum;
		int ageMonths = currentMonthNum - birthMonthNum;
		
	
		if (currentDayNum < birthDayNum) {
			ageMonths = ageMonths - 1;
		}
		
		if (currentMonthNum <= birthMonthNum & ageMonths < 0) {
			ageYears = ageYears - 1;
		} 
		

		
		if (ageMonths < 0) {
			ageMonths = ageMonths + 12;
		}
		
		
		JOptionPane.showMessageDialog(null, "Your age is " + ageYears + " years and " + ageMonths + " months");
		
		
	}
		
	}