package snackbar;

public class Vending {
    //fields
    public static int maxId = 0;
    public int id;
    public String name;

    public Vending(String name)
    {
        maxId++;
        id = maxId;

        this.name = name;
    }

    //get and set

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return "Snack :"+name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}