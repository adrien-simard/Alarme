import java.sql.Date;

public class AlarmeRadiation implements AlerteRadationListener{
	static private int seuil;
	
	public AlarmeRadiation() {
		super();
	}

	public static int getNiveau() {
		return seuil;
	}

	public static void setNiveau(int niveau) {
		AlarmeRadiation.seuil = niveau;
	}

	@Override
	public String messageRadiation(Date date, String localisation, int importance, int niveau) {
		// TODO Auto-generated method stub
		return "Alerte apparue le" +date+", localisation:"+localisation+". Attention, importance de :"+importance+"/3 et niveau de radiation ="+niveau;
	}

	
} 
