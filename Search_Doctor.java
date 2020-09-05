import java.util.*;
import java.util.Scanner;
import java.util.Collections;
class Doctor implements Comparable {

	private String name;
	private String speciality;
	private int experience;

	//CODE HERE
	Doctor(String n,String s,int exp){
	    this.name = n;
	    this.speciality = s;
	    this.experience = exp;
	}
	String getName(){
	    return this.name;
	}
	String getSpec(){
	    return this.speciality;
	}
	int getExp(){
	    return this.experience;
	}
	void setDetails(String n,String spec,int exp){
	    this.name = n;
	    this.speciality = spec;
	    this.experience = exp;
	}
	@Override
	public int compareTo(Object o){
	    Doctor d = (Doctor) o;
	    return d.experience - this.experience;
	}
	@Override
	public String toString(){
	    return name + " " + speciality + " " + experience;
	}
  }

class DoctorService {

    //DONT MODIFY THIS	
	private List<Doctor> doctorsRepository;
	
	//DONT MODIFY THIS
	public DoctorService(List<Doctor> doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}
    //CODE HERE    
    public List<Doctor> getExperiencedDoctors(int yrs){
        int i,j,e1,e2;
        int len = doctorsRepository.size();
        List<Doctor> tempDoc = new ArrayList<Doctor>();
        String str1,str2,na1,na2;
        Collections.sort(doctorsRepository);
        for(i=0;i<len;i++){
            for(j=0;j<i-1;j++){
                str1 = doctorsRepository.get(j).getSpec();
                na1 = doctorsRepository.get(j).getName();
                e1 = doctorsRepository.get(j).getExp();
                str2 = doctorsRepository.get(j+1).getSpec();
                na2 = doctorsRepository.get(j+1).getName();
                e2 = doctorsRepository.get(j+1).getExp();
                if(str1.compareTo(str2)>0){
                    doctorsRepository.get(j).setDetails(na2,str2,e2);
                    doctorsRepository.get(j+1).setDetails(na1,str1,e1);
                }
                
            }
        }
        j=1;
        for(i=0;i<len;i++){
            if(doctorsRepository.get(i).getExp()>=yrs){
                tempDoc.add(doctorsRepository.get(i));
                j=0;
            }
        }
        if(j==1){
            System.out.println("No Doctors Found");
        }
        return tempDoc;
        
    }
    public Set<Doctor> getSpecialityDoctor(String Dept){
        Set<Doctor> DeptDoc = new LinkedHashSet<Doctor>();
        int i,j,e1,e2;
        int len = doctorsRepository.size();
        String str1,str2,na1,na2;
        Dept = Dept.toLowerCase();
        for(i=0;i<len;i++){
            for(j=0;j<i;j++){
                str1 = doctorsRepository.get(j).getSpec();
                na1 = doctorsRepository.get(j).getName();
                e1 = doctorsRepository.get(j).getExp();
                str2 = doctorsRepository.get(j+1).getSpec();
                na2 = doctorsRepository.get(j+1).getName();
                e2 = doctorsRepository.get(j+1).getExp();
                if(na1.compareTo(na2)>0){
                    doctorsRepository.get(j).setDetails(na2,str2,e2);
                    doctorsRepository.get(j+1).setDetails(na1,str1,e1);
                }
                
            }
        }
        j=1;
        for(i=0;i<len;i++){
            str1 = doctorsRepository.get(i).getSpec();
            if(Dept.equalsIgnoreCase(str1)){
                DeptDoc.add(doctorsRepository.get(i));
                j=0;
            }
        }
        if(j==1){
            System.out.println("No Doctors Found");
        }
        return DeptDoc;
    }
      
}



public class Source {
	
	//DON'T MODIFY THIS
	private static String doctorsData;
	
	//DON'T MODIFY THIS
	static {
		StringBuilder doctors = new StringBuilder();
		doctors.append("Amy-Pediatrics-16;");
		doctors.append("John-Dermatology-10;");
		doctors.append("David-Dermatology-15;");
		doctors.append("Bob-Pediatrics-6;");
		doctors.append("Cathy-Dermatology-5;");
		doctors.append("Mavis-Pediatrics-11;");
		doctors.append("Robin-Pediatrics-7;");
		doctors.append("Minty-Dermatology-9;");
		doctors.append("Jim-Cardiology-25;");
		doctorsData = doctors.toString();
	}
	
    public static void main(String[] args) {
		//CODE HERE
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
		    List<Doctor> DocData = new ArrayList<Doctor>();
		    String docList[] = doctorsData.split(";");
		    int i;
		    int length = docList.length;
		    for(i=0;i<length;i++){
		        String send[] = docList[i].split("-");
		        DocData.add(new Doctor(send[0],send[1],Integer.parseInt(send[2])));
		    }
		    DoctorService DrServ = new DoctorService(DocData);
	        int choice = sc.nextInt();
		    switch(choice){
	            case 1:
		            int years=sc.nextInt();
		            System.out.println(DrServ.getExperiencedDoctors(years));
		            break;
	            case 2:
	                String dept = sc.nextLine().trim();
	                System.out.println(DrServ.getSpecialityDoctor(dept));
	                break;
	            default:
	                System.out.println("Invalid Choice");
		    
		    }
		    
		}

	}
}
