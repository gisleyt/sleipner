package no.cuteforce.sleipner.parser.parser.resultparser;

import org.jsoup.Connection;

public class ResultParser implements Iterable<ResultParser.Result> {

    public Enum


    public static class Result {
        public String id;
        public String kusk;
        public StartMetode start;

    }


    private Connection connection;

    public ResultParser(Connection connection) {
        this.connection = connection;
    }








}
