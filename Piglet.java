import java.time.LocalDate;
import java.time.Duration;
import java.time.format.DateTimeFormatter;


class Piglet extends Pig 
{
    private boolean drinksMilk;
    private LocalDate birthday;
    
    Piglet(String name, LocalDate birthday, boolean drinksMilk)
    {
        super(name,0);
        this.birthday = birthday;
        this.drinksMilk = drinksMilk;
    }
    public boolean getDrinksMilk()
    {
        return drinksMilk;
    }
    public LocalDate getBirthday()
    {
        return birthday;
    }
    public void setDrinksMilk(boolean value)
    {
        drinksMilk = value;
    }
    public void setBirthday(LocalDate date)
    {
        birthday = date;
    }
    public int getAge() 
    {
        LocalDate today = LocalDate.now();
        Duration age = Duration.between(birthday.atStartOfDay(), today.atStartOfDay());
        return ((int)(age.toDays()) / 365);
    }

    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        return (super.toString() + "\nThis pig is a piglet.\nIt" +
         (drinksMilk ? " drinks" : " does not drink") + " milk.\n" +
         "It's birthday is " + getBirthday().format(dtf) + ".");
         
    }
}