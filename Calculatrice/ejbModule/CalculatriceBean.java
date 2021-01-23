import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.SecurityDomain;

@Stateless (name="bean1")
@Local (Calculate.class)
@SecurityDomain("defaultSD")
public class CalculatriceBean implements Calculate {

	@Override
	@PermitAll
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	@RolesAllowed("admin")
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
