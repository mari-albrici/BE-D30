package bed30.Proxy.entities;

import bed30.Proxy.entities.proxys.ControlCentreProxy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControlCentre implements ControlCentreProxy {

    private double lat;
    private double lon;
    private int smokeLevel;


    @Override
    public double getLat() {
        return 0;
    }

    @Override
    public double getLon() {
        return 0;
    }

    @Override
    public int getSmokeLevel() {
        return 0;
    }
}
