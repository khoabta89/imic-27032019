package imic.OnTap;

public class Drink
{
    String category;
    String name;
    protected Double price;
    String size;

    public String toString()
    {
        return String.format("%s -> %sK", name, price);
    }

    public Double getPrice()
    {
        if (size == "M")
        {
            price = price + 5;
        }
        else if (size == "L")
        {
            price = price + 10;
        }
        return price;
    }
}
