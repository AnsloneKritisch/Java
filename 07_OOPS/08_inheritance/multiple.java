//  This is whole wrong as java doesn't support multiple inheritance


class A 
{
    void show()
    {
        System.out.println("This is class A");
    }
}

class B 
{
    void show()
    {
        System.out.println("This is class B");
    }
}




class multiple extends A , B
{
    public static void main(String[] args) {
        multiple obj = new multiple();

    }

    
}
