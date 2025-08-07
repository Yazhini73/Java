import java.util.Scanner;
class Employee{
String empname,empid,address, mailid, mobileno;
double basicpay;
Scanner sc=new Scanner(System.in);
void readdetails()
{
System.out.println("Enter employee name:");
empname=sc.nextLine();
System.out.println("Enter employee 10:");
empid=sc.nextLine();
System.out.println("Enter employee address:");
address=sc.nextLine();
System.out.println("Enter employee mail Id:");
mailid=sc.nextLine();
System.out.println("Enter employee mobile No:");
mobileno=sc.nextLine();
System.out.println("Enter employee Badic pay:");
basicpay=sc.nextDouble();
sc.nextLine();
}
void displaydetails(){
System.out.println("\n......Employee details......");
System.out.println("Name : "+empname);
System.out.println("ID :"+empid);
System.out.println("Address :"+address);
System.out.println("Mail :"+mailid);
System.out.println("Mobile No. :"+mobileno);
System.out.println("Basicpay :"+basicpay);
}
}
class Programmer extends Employee{
void generatePaySlip(){
double da= basicpay*97/100;
double hra= basicpay*10/100;
double pf= basicpay*12/100;
double staffclub= basicpay*1/100;
double gross= basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Programmer");
System.out.println("DA:" +da);
System.out.println("HRA :"+hra);
System.out.println("PF :"+pf);
System.out.println("Staff Club :"+staffclub);
System.out.println("Gross pay :"+gross);
System.out.println("Net :"+net);
}
}
class AssistantProfessor extends Employee{
void generatePaySlip(){
double da= basicpay*110/100;
double hra= basicpay*20/100;
double pf= basicpay*12/100;
double staffclub= basicpay*5/100;
double gross= basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Assistant Professor");
System.out.println("DA:" +da);
System.out.println("HRA :"+hra);
System.out.println("PF :"+pf);
System.out.println("Staff Club :"+staffclub);
System.out.println("Gross pay :"+gross);
System.out.println("Net :"+net);
}
}
class AssociateProfessor extends Employee{
void generatePaySlip(){
double da= basicpay*130/100;
double hra= basicpay*30/100;
double pf= basicpay*12/100;
double staffclub= basicpay*10/100;
double gross= basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Associate Professor");
System.out.println("DA:" +da);
System.out.println("HRA :"+hra);
System.out.println("PF :"+pf);
System.out.println("Staff Club :"+staffclub);
System.out.println("Gross pay :"+gross);
System.out.println("Net :"+net);
}
}
class Professor extends Employee{
void generatePaySlip(){
double da= basicpay*140/100;
double hra= basicpay*40/100;
double pf= basicpay*12/100;
double staffclub= basicpay*15/100;
double gross= basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Professor");
System.out.println("DA:" +da);
System.out.println("HRA :"+hra);
System.out.println("PF :"+pf);
System.out.println("Staff Club :"+staffclub);
System.out.println("Gross pay :"+gross);
System.out.println("Net :"+net);
}
}
public class EmployeePaySlip{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee designation :\n1.Programmer\n2.Assistant Professor\n3. Associate Professor\n4.Professor");
int choice=sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
    Programmer p=new Programmer();
    p.readdetails();
    p.generatePaySlip();
    break;
case 2:
    AssistantProfessor ap=new AssistantProfessor();
    ap.readdetails();
    ap.generatePaySlip();
    break;
case 3:
    AssociateProfessor asp=new AssociateProfessor();
    asp.readdetails();
    asp.generatePaySlip();
    break;
case 4:
    Professor prof=new Professor();
    prof.readdetails();
    prof.generatePaySlip();
    break;
default:
System.out.println("invalidchoice");
}
sc.close();
}
}







