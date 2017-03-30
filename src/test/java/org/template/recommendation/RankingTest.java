package org.template.recommendation;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class RankingTest {
    @Test
    public void typeList() throws Exception {
        List<String> list = new LinkedList<>();
        list.add("popular");
        list.add("trending");
        list.add("hot");
        list.add("userDefined");
        list.add("random");

        assertEquals(list, Ranking.typesList());
    }

    @Test
    public void typeString() throws Exception {
        String s = "popular, trending, hot, userDefined, random";

        assertEquals(s, Ranking.typesString());
    }

    @Test
    public void fieldNamesList() throws Exception {
        List<String> list = new LinkedList<>();
        list.add("userRank");
        list.add("uniqueRank");
        list.add("popRank");
        list.add("trendRank");
        list.add("hotRank");

        assertEquals(list, Ranking.fieldNamesList());
    }

    @Test
    public void fieldNamesString() throws Exception {
        String s = "userRank, uniqueRank, popRank, trendRank, hotRank";

        assertEquals(s, Ranking.fieldNamesString());
    }

}