import java.sql.Date;
import java.util.EventListener;

public interface AlerteRadationListener extends EventListener {

	public String messageRadiation(Date date, String localisation, int importance, int niveau);
	
}
