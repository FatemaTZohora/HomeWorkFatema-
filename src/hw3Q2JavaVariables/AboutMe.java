package hw3Q2JavaVariables;

public class AboutMe {

	public String myInfo;
	public String myName = "FatemaTZohora";
	public int mySalary = 1000000000;
	public char sex = 'F';
	public boolean usCitizen = true;
	public byte myAge = 22;
	public short houseRent = 2000;
	public long myBankBalance = 80000000000l;
	public float hight = 5.5f;
	public double myGrade = 4.67879;

	// Here myInfo variable is declared as I didn't assign any value of it. And
	// 'myName' , 'mySalary', 'sex', 'myAge', 'usCitizen', etc. all the variables
	// are initialized because I assigned their value.
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name: " + aboutMe.myName + "," + " My Age: " + aboutMe.myAge + "," + " My sex is: "
				+ aboutMe.sex + "," + " My salary is " + aboutMe.mySalary + ".");
	}

}
