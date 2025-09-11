import java.util.Scanner;

class Eb_bill

{

public static void main(String[]args)

{

int unit,prev,curr,cnum,choice;

String cname;

double bill=0;

Scanner input=new Scanner(System.in);

System.out.println("consumer no:");

cnum=input.nextInt();

System.out.println("consumer name:");

input.nextLine();

cname=input.nextLine();

System.out.println("pre month reading");

prev=input.nextInt();

System.out.println("current month reading");

curr=input.nextInt();

System.out.println("enter 1 for domes or 2 for commercial ");

choice=input.nextInt();

unit=curr-prev;

switch (choice)

{

case 1:

if (unit<=100){

bill=unit*1;

}

else if (unit>100 && unit<=200){

bill=100*1+(unit-100)+2.50;

}else if(unit>200 && unit<=500){

bill=100*1+2.50+(unit-200)*4;

}else{

bill=100*1+100*2.50*300*4+(unit-500)*6;

}

case 2:

if (unit<=100){

bill=unit*2;

}else if (unit>100 && unit<=200){

bill=100*2+(unit-100)*4.50;

}else if(unit>200 && unit<=500){

bill=100*2+100*4.50+(unit-200)*6;

}else{

bill =100*2+100*4.50+300*6+(unit-500)*7;

}

break;

default:

System.out.println("invalid choice:");

return;

}

System.out.println("\t eb bill calculation \t:");

System.out.println("___________");

System.out.println("consumer name:"+cname);

System.out.println("consumer no:"+cnum);

System.out.println("pre month reading:"+prev);

System.out.println("current month reading:"+curr);

System.out.println("type of connection:"+(choice==1?"Domestic":"commerical"));

System.out.println("total charge:rs"+bill);


}

}