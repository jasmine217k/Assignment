package Day2;

public class UC1EmpAttendance {

    public static void main(String[] args)
    {
        int IS_PRESENT=1;

        double attendance= Math.floor(Math.random()*10) % 2;

        if(attendance == IS_PRESENT)
            System.out.println("The Employee is present");
        else
            System.out.println("The Employee is absent");

    }
}
