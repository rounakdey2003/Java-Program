import java.io.*;
class vehicle
{
  int no_of_wheels;
  float sp;
}

class car extends vehicle
{
  int no_of_pa;
}

class truck extends vehicle
{
   float ld_limit;
}

class calc
{
  
  public static void main(String args[])
  
    throws IOException
{

    vehicle a=new vehicle();
    car b=new car();
    truck c=new truck();
 
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter the no of wheels of car");
    b.no_of_wheels=Integer.parseInt(br.readLine());

    System.out.println("enter the speed of car");
    b.sp=Float.parseFloat(br.readLine());

    System.out.println("enter the no of passengers in the car");
    b.no_of_pa=Integer.parseInt(br.readLine());

    System.out.println("enter the no of wheels of the truck");
    c.no_of_wheels=Integer.parseInt(br.readLine());

    System.out.println("enter the speed of the truck");
    c.sp=Float.parseFloat(br.readLine());

    System.out.println("enter the load limit");
    c.ld_limit=Float.parseFloat(br.readLine());

    System.out.println("\n\ndetails of car are");
    System.out.println("no of wheels= "+b.no_of_wheels);

    System.out.println("speed= "+b.sp);
    System.out.println("no of passengers= "+b.no_of_pa);

    System.out.println("\n\ndetails of truck");
    System.out.println("no of wheels= "+c.no_of_wheels);

    System.out.println("speed "+c.sp);
    System.out.println("load limit= "+c.ld_limit);

    if(b.sp<c.sp)
      System.out.println("car is slower");
    else
      System.out.println("car is faster");
   }
}


    

    

 