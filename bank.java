class Account{
String Bankname;
String Branchname;
long accno;
long phoneno;
}

class bank{
public static void main(String[]args){
Account a1=new Account();
Account a2=new Account();

a1.Bankname="SBI";
a1.Branchname="Shirwal";
a1.accno=23456789001L;
a1.phoneno=8485093734L;

a2.Bankname="HDFC";
a2.Branchname="pune";
a2.accno=8765433456L;
a2.phoneno=7656789003L;

System.out.println("a1.Bankname\t:" +a1.Bankname);
System.out.println("a1.Branchname\t:" +a1.Branchname);
System.out.println("a1.accno\t:" +a1.accno);
System.out.println("a1.phoneno\t:" +a1.phoneno);

System.out.println("a2.Bankname\t:" +a2.Bankname);
System.out.println("a2.Branchname\t:" +a2.Branchname);
System.out.println("a2.accno\t:" +a2.accno);
System.out.println("a2.phoneno\t:" +a2.phoneno);

}
}







