import java.sql.Date;

public interface AlerteEmissionListener {
	
	public String messageEmission(Date date, String localisation, int importance, int niveau);
}
