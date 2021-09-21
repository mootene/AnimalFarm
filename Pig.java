class Pig implements Animal {
    private String name;
    private int age;
   
    Pig(String newName, int newAge)
    {
        this.name = newName;
        this.age = newAge;
    }

    public String getName() 
    {
        return this.name;
    }

    public int getAge() 
    {
        return this.age;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public void animalSound() 
    {
        System.out.println("The pig says: oink");
    }

    public void sleep() 
    {
        System.out.println("zzz");
    }

    public String toString()
    {
        return ("My pig is " + getAge() + " years old.\n" 
        + "Their name is " + getName() + ".");
    }

}



