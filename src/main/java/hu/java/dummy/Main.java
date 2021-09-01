package hu.java.dummy;

import hu.java.dummy.db.DatabaseSessionProvider;

public class Main {

    public static void main(String[] args) {
        DatabaseSessionProvider.getInstance();
    }
}
