package org.template.recommendation;

/**
 * Created by jihunkim on 2/12/17.
 */
public enum RecsModel {
    ALL ("all"),
    CF("collabFiltering"),
    BF("backfill");

    public final String value;

    RecsModel(String value) {
        this.value = value;
    }

    public static String valsAsString() {
        return ALL.value + " | " + CF.value + " | " + BF.value;
    }
}
