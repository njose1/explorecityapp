package com.example.ec.domain;

/**
 * Enumeration of the region of City.
 *
 * Created by Neethu Jose
 */


public enum Region {
	
	BER("Berlin"), COL("Cologne"), MUN("Munich"), Varies("Varies");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    public static Region findByLabel(String byLabel) {
        for(Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }


}
