import java.util.Date;
import java.util.EventListener;

public interface AlarmeRadiationListener extends EventListener {
	public String receptionRad(Date dateApparition, String localisation,int importance);

}
