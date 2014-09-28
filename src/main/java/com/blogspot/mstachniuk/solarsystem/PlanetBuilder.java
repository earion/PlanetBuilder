package com.blogspot.mstachniuk.solarsystem;

import com.blogspot.mstachniuk.solarsystem.vo.Distance;

import java.math.BigDecimal;

/**
 * Created by earion on 9/28/14.
 */
public class PlanetBuilder {

    private Planet planet;

    String name;
    private RotationDirection rotationDirection;
    private Distance distance;
    private SiderealYear sideralYear;


    public PlanetBuilder() {
           name = "Nieznana Planeta";
    }

    public PlanetBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public PlanetBuilder setRotationDirection(RotationDirection rotationDirection) {
        this.rotationDirection = rotationDirection;
        return this;
    }


    public PlanetBuilder setDistance(String distance) {
        this.distance = Distance.createFromKM(new BigDecimal(distance));
        return this;
    }

    public  PlanetBuilder setSideralYear(String siderialYear) {
        this.sideralYear = new SiderealYear(new BigDecimal(siderialYear));
        return this;
    }

    public Planet build() {
        planet = new Planet(name,rotationDirection,distance,sideralYear);
        return planet;
    }
}
