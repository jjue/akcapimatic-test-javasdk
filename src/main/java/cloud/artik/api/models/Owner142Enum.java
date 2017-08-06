/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Owner142Enum {
    USER, //TODO: Write general description for this element
    APPLICATION, //TODO: Write general description for this element
    ALL; //TODO: Write general description for this element

    private static TreeMap<String, Owner142Enum> valueMap = new TreeMap<String, Owner142Enum>();
    private String value;

    static {
        USER.value = "user";
        APPLICATION.value = "application";
        ALL.value = "all";

        valueMap.put("user", USER);
        valueMap.put("application", APPLICATION);
        valueMap.put("all", ALL);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Owner142Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Owner142Enum values to list of string values
     * @param toConvert The list of Owner142Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Owner142Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Owner142Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 