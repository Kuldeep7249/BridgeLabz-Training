//  package inheritence;
  class Animals {
    private String name;
    private int age;
    public Animals(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String makeSound(){
        return "Animal Sound";
    }
 }
     class Dog extends Animals{
        public Dog(String name,int age){
            super(name,age);
        }
        @Override
         public String makeSound(){
        return "Dog barks";
    }
}
    class Cat extends Animals{
        public Cat(String name,int age){
            super(name,age);
        }
        @Override
         public String makeSound(){
        return "Cat meow";
    }
}
     class Birds extends Animals{
        public Birds(String name,int age){
            super(name,age);
        }
        @Override
         public String makeSound(){
        return "Birds Chirps";
    }
}
 class Animal{
    public static void main(String []args){
        Animals a=new Animals("rishabh",90);
        Animals b=new Cat("cat",10);
        System.out.println(a.makeSound());
        System.out.println(b.makeSound());
    }
}