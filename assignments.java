class Student extends Address
{
	String firstName;
	String lastName;
	Address addr;
	Date dob;
	String [] skills;
	int skillsnum;
	Qualification[] qual;
	int qualnum;
	Project [] projects;
	int projectsnum;
	String eMail;
	String contactNo;
	Student()
	{
		firstName=null;
		lastName=null;
		addr = new Address();
		dob= new Date();
		skills=null;
		skillsnum=0;
		qualnum=0;
		projectsnum=0;
		qual= new Qualification[0];
		projects= new Project[0];
		eMail=null;
		contactNo=null;
	}
	Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen,Project[] g,int glen,String h,String i)
	{
		int k;
		firstName=a;
		lastName=b;
		addr = c;
		dob= d;
		skillsnum=elen;
		qualnum=flen;
		projectsnum=glen;
		String[] skills=new String[skillsnum];
		Qualification[] qual=new Qualification[qualnum];
		Project[] projects=new Project[projectsnum];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]= f[k];
		}
		for(k=0;k<projectsnum;k++)
		{
			projects[k]= g[k];
		}
		eMail=h;
		contactNo=i;
	}
	Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen,String i,String j)
	{
		int k;
		firstName=a;
		lastName=b;
		addr = c;
		dob= d;
		skillsnum=elen;
		qualnum=flen;
		String[] skills=new String[elen];
		Qualification[] qual=new Qualification[flen];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]= f[k];
		}
		eMail=i;
		contactNo=j;
	}
	void display()
	{
		System.out.println("Firstname :" +firstName);
		System.out.println("Lastname :" +lastName);
		System.out.println("Address :");
		addr.display();
		System.out.print("Date of birth : ");
		dob.display();
		System.out.println("Skills :");
		if(skillsnum>0)
		{
			for(int i=0;i<skillsnum;i++)
			{
				System.out.println((i+1)+". "+skills[i]);
			}
		}
		if(qualnum>0)
		{
			for(int i=0;i<qualnum;i++)
			{
				System.out.println((i+1)+". "+qual[i]);
			}
		}
		if(projectsnum>0)
		{
			for(int i=0;i<projectsnum;i++)
			{
				System.out.println((i+1)+". "+projects[i]);
			}
		}
		System.out.println("Email ID :"+eMail);
		System.out.println("Contact No. :"+contactNo);
	}
}