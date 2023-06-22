package kritisch;


class pack
{
    private void show ()
    {
        System.out.println("show");
    }

    public static void main (String[] args)
    {
        pack obj = new pack();
        obj.show();

    }

}

// javac -d . pack.java

// java kritisch.pack