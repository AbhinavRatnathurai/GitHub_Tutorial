package Tut_1;

public class Main {
    public static void main(String[] args) {    //Q1
        System.out.println("Welcome to Online Learning!\n\nPlease virus go away!");

        String message = new String("First week of lectures");
        int n = message.length(); // calling method on the object
        System.out.println("n=" + n);


        for (int i=0; i<100; i++)
            if (i % 2 == 0)
                System.out.print(i +",");


        System.out.println("\n");    //Q4
        int j = 0;
        while (j <100) {
            if (j % 2 == 0)
                System.out.print(j + ",");
            j++;
        }
        System.out.println("\n");

        String x = "abc"; //strings passed by references Q5
        String y = x;
        y = new String("123");
        String z = x;
        y = x;
        z = "456";
        System.out.println(x + y + z);


        //Q6
        int numbers[] = new int[6];
        for(int i=0;i<numbers.length;i++) // method length is called on an object called numbers
            setRandom(numbers,i);

        for(int number: numbers)
            System.out.println(number);

    }

    public static boolean isExist(int[] arr,int value)
    {
        for(int number:arr)
        {
            if(number==value)
                return true;
        }
        return false;
    }

    public static void setRandom(int[] arr, int index)
    {
        boolean set = false;
        while (set==false)

        {
            int value = (int)Math.round(Math.random()*49);
            if(isExist(arr,value)==false)
            {
                arr[index]=value;
                set = true;
            }
        }
    }
}


