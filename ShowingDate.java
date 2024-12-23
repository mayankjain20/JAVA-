
import java.text.SimpleDateFormat;
import java.util.Date;


public class ShowingDate {
    public static void main(String[] arg){

        Date date=new Date();
        String DATE_FORMAT="dd/MM/yyyy";
        String DateFormat="HH:mm:ss a";
        SimpleDateFormat sdf=new SimpleDateFormat(DateFormat);
        SimpleDateFormat sd=new SimpleDateFormat(DATE_FORMAT);
        System.out.println("Time with AM/PM field :"+sdf.format(date));
        System.out.println("today is: "+sd.format(date));

    }
}
