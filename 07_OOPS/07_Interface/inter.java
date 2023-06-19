interface car
{
    int lspeed = 100;
    int hspeed = 4500;

    void start();
    void stop();

}

class inter implements car
{
    @Override

    public void start()
    {
        System.out.println("Let's start slow "+lspeed);
    }

    @Override

    public void stop()
    {
        System.out.println("Let's go crazy"+hspeed);
    }


    public static void main(String[] args) {
        inter ob = new inter();

        ob.start();
        ob.stop();
    }

}

