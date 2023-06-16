package bed30.Proxy.entities;

import bed30.Proxy.entities.proxys.ProbeProxy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.ldap.Control;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Probe implements ProbeProxy {

    ControlCentre controlCentre;
    int id;
    String alarm = "!!! ALARM !!!";
    String url;


    @Override
    public void alarmControl() {
        if(controlCentre.getSmokeLevel() >= 5){
            System.out.println(alarm);
            url = "http://host/alarm?=idsonda=" + id + "&lat=" + controlCentre.getLat() + "&lon=" + controlCentre.getLon() + "&smokelevel=" + controlCentre.getSmokeLevel();
            System.out.println(url);
        }
    }
}
