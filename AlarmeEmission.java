import java.sql.Date;

public class AlarmeEmission implements AlerteEmissionListener{
	
	private static String type;
	
	
	public static String getType() {
		return type;
	}


	public static void setType(String type) {
		AlarmeEmission.type = type;
	}


	@Override
	public String messageEmission(Date date, String localisation, int importance, int niveau) {
		// TODO Auto-generated method stub
		return "Alerte apparue le" +date+", localisation:"+localisation+". Attention, importance de :"+importance+"/3 et le type d'émission est ="+type;
	}
}
