import java.util.*;
class Vehicle{
        String Brand;
        String model;
        int prize;
        public Vehicle(String Brand,String model,int prize){
             this.Brand=Brand;
             this.model=model;
             this.prize=prize;
        }
        public void dis(){
            System.out.println(Brand);
            System.out.println(model);
            System.out.println(prize);
        }

}
class Car extends Vehicle{
         int d;
         public Car(String Brand,String model,int prize,int door){
            super(Brand,model,prize);
            d=door;
         }
         public void dis(){
            super.dis();
            System.out.println(d);
         }

}
class Bike extends Vehicle{
         String d;
         public Bike(String Brand,String model,int prize,String door){
            super(Brand,model,prize);
            d=door;
         }
         public void dis(){
            super.dis();
            System.out.println(d);
         }

}
class Demo{
    public static void main(String[] args){
     Scanner n=new Scanner(System.in);
     String Brand=n.nextLine();
     String model=n.nextLine();
     int prize=n.nextInt();
     int door=n.nextInt();
     n.nextLine();
     String B=n.nextLine();
     String m=n.nextLine();
     int p=n.nextInt();
     n.nextLine();
     String ty=n.nextLine();
     Vehicle v1= new Car(Brand,model,prize,door);
     Vehicle v2= new Bike(B,m,p,ty);
     System.out.println("Car detalis");
     v1.dis();
     System.out.println("Bike detalis");
     v2.dis();
    }
}