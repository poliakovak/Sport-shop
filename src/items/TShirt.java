package items;

import brands.Brand;
import brands.ActiveSports;

public abstract class TShirt implements Item {

    @Override
    public Brand brand() {
        return new ActiveSports();
    }

    @Override
    public abstract double price();
}
