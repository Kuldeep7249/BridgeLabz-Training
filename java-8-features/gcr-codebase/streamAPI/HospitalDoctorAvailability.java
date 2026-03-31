import java.util.*;
class Doctor{
    String name,specialty;
    boolean weekend;
    Doctor(String n,String s,boolean w){name=n;specialty=s;weekend=w;}
}
public class HospitalDoctorAvailability{
    public static void main(String[] args){
        List<Doctor> doctors=List.of(
            new Doctor("Dr A","Cardiology",true),
            new Doctor("Dr B","Neurology",false),
            new Doctor("Dr C","Dermatology",true)
        );
        doctors.stream()
               .filter(d->d.weekend)
               .sorted(Comparator.comparing(d->d.specialty))
               .forEach(d->System.out.println(d.name+" "+d.specialty));
    }
}