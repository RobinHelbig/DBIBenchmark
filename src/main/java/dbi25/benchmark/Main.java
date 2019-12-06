package dbi25.benchmark;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // config
        final String server = "DBI25";
        final String instance = "DBISQL";
        final String database = "benchmark";
        final String user = "dbi";
        final String password = "dbi_pass";

        // benchmark
        InsertBenchmark.insertBenchmark(10, server, instance, database, user, password);
        InsertBenchmark.insertBenchmark(20, server, instance, database, user, password);
        InsertBenchmark.insertBenchmark(50, server, instance, database, user, password);
    }
}
