import java.util.*;
class Switch
{
public static void main(String args[])
{
Scanner mo = new Scanner(System.in);
int month ;

System.out.println("Please enter a month");
month = mo.nextInt();
String season;
String reqmonth;
switch (month)
{
case 12:reqmonth="December";break;
case 1:reqmonth="January";break;
case 2:reqmonth="Febraury";
season = "Winter";break;
case 3:reqmonth="March";break;
case 4:reqmonth="April";break;
case 5:reqmonth="May";
season = "Summer";break;
case 6:reqmonth="June";break;
case 7:reqmonth="July";break;
case 8:reqmonth="August";
season = "Rainy";break;
case 9:reqmonth="September";break;
case 10:reqmonth="October";break;
case 11:reqmonth="November";
season = "Autumn";break;

default:
season = "Bogus Month";
}
System.out.println(reqmonth + " is in the " + season + ".");
}
}