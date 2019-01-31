

class Student extends Address
{
	String firstName;
	String lastName;
	Address addr;
	Date dob; 		//date of birth 
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo ;
	Student()
	{
		firstName=null;
		lastName=null;
		addr=new Address();
		dob=new Date();
		skills=null;
		skillnum=0;
		qualnum=0;
		projectsnum=0;
		qual=new Qualification[0];
		projects =new Project[0];
		eMail=null;
		contactNo=null;
	}
	Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen ,Project [] g,int glen,String h,String i )
	{
		int k;
		firstName=a;
		lastName=b;
		addr=c;
		dob=d;
		skillsnum=elen;
		qualnum=flen;
		projectnum=glen;
		String[] skills =new String[skillsnum];
		Qualification[] qual=new Qualfication[qualnum];
		Project[] projects=new Project[projectsnum];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]=f[k];
		}
		for(k=0;k<projectnum;k++)
		{
			project[k]=g[k];
		}

		eMail=h;
		contactNo=i;
	}
	Student(String a,String b,Address c,Date d, String[] e,int elen,Quaification []f , int flen,String i, String j)
	{
		int k;
		firstName=a;
		lastName=b;
		addr=c;
		dob=d;
		skillsnum=elen;
		qualnum=flen;
		String [] skills =new String[elen];
		Qualification[] qual=new Qualification[flen];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]=f[k];
		}
		eMail=i;
		contactNo=j;
	}
	void display()
	{
		System.out.println("Firstname: "+firstName);
		System.out.println("last name:"+lastName);
		System.out.println("Address: ");
		addr.display();
		System.out.println("Date1")

	}


}

class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;

}
class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;
}
class project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String[] responsiblities;
}