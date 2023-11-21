package Day2;

public class UC1EmpAttendance {

    public static void main(String[] args)
    {
        int PRESENT=1;

        double attendance= Math.floor(Math.random()*10) % 2;

        if(attendance == PRESENT)
            System.out.println("The Employee is present");
        else
            System.out.println("The Employee is absent");

    }
}
