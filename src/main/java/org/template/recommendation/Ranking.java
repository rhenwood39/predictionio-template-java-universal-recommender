package org.template.recommendation;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public enum Ranking {
    POPULAR("popular", "popRank"),
    TRENDING("trending", "trendRank"),
    HOT("hot", "hotRank"),
    USERDEFINED("userDefined", "userRank"),
    RANDOM("random", "uniqueRank");

    public final String type;
    public final String fieldName;

    public static List<String> typesList() {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(
                POPULAR.type,
                TRENDING.type,
                HOT.type,
                USERDEFINED.type,
                RANDOM.type));
        return list;
    }

    public static String typesString() {
        return String.format("%s, %s, %s, %s, %s",
                POPULAR.type,
                TRENDING.type,
                HOT.type,
                USERDEFINED.type,
                RANDOM.type);
    }

    public static List<String> fieldNamesList() {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(
                USERDEFINED.fieldName,
                RANDOM.fieldName,
                POPULAR.fieldName,
                TRENDING.fieldName,
                HOT.fieldName));
        return list;
    }

    public static String fieldNamesString() {
        return String.format("%s, %s, %s, %s, %s",
                USERDEFINED.fieldName,
                RANDOM.fieldName,
                POPULAR.fieldName,
                TRENDING.fieldName,
                HOT.fieldName);
    }


}
