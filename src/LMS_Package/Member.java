package LMS_Package;

public class Member {
   private String name;
   private int age;
   private IDType  idType;

   public Member(String name, int age, IDType idType){
       this.name = name;
       this.age = age;
       this.idType = idType;
   }

   public String getName(){
       return name;
   }

   public int getAge(){
       return age;
   }

   public IDType getIdType(){
       return idType;
   }

   public void memberDetails (){
       System.out.println("name :"+name+ "\n"
               +"age :"+ age + "\n"
               +"IDType : "+idType
       );

   }
    enum IDType  {
        Adhar_Card, Voter_ID, School_ID

    }



}
