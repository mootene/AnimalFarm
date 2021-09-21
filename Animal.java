interface Animal {
  public void animalSound(); 
  public void sleep(); 
  public String getName();
  public int getAge();
  default public boolean getDrinksMilk()
  {
        return false;
  }

}
