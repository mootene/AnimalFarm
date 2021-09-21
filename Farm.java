import java.time.LocalDate;

class Farm
{
    public static void main(String[] args) {
        Pig myPig = new Pig("Gemima", 5); 
        Piglet myPiglet = new Piglet("Wilbur", LocalDate.now(), true);
     
        System.out.println(myPig);
        myPig.animalSound();
        myPig.sleep();

        System.out.println("\n" + myPiglet);
        myPiglet.animalSound();
        myPiglet.sleep();
  }
}