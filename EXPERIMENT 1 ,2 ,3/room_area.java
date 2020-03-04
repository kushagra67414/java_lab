class room_area

{

    private int l,b;

    room_area(int x,int y)

    { l=x; b=y;}

    int area()

    {return(l*b);}

}

class class_room extends room_area

{

    int h;

    class_room(int x,int y,int z)

    {

        super(x,y);

        h=z;

    }

    int volume()

    {

        return(area()*h);

    }

}

class Inheritance

{

    public static void main(String args[])

    {

        class_room cr=new class_room(10,20,15);

        int a1=cr.area();

        int v1=cr.volume();

        System.out.println("Area of Room : "+a1);

        System.out.println("Volume of Room : "+v1);

    }

}