package OneToMany;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SaveUserDeptAndEmp
{
public static void main(String[] args) 
{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	System.out.println(factory);
	

}
}
