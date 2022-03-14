package items;

import brands.Brand;
import brands.SmartCaps;

public abstract class Cap implements Item {

    @Override
    public Brand brand() {
        return new SmartCaps();
    }

    @Override
    public abstract double price();
}
