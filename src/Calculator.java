import java.util.HashMap;

public class Calculator {
//public static int add(int a, int b) {
//	return a+b;
//}
static HashMap<Integer,String> Trainee=new HashMap<Integer,String>();	


public static int addTrainee(int id, String name) {
	Trainee.put(id, name);
	return Trainee.size();
	
}

public static String updateTrainee(int id, String name) {
	return Trainee.put(id, name);
	//return Trainee.size();
	
}

public static int FetchAllTrainee() {
	
	return Trainee.size();
	
}
}
