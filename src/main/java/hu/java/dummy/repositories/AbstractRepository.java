package hu.java.dummy.repositories;

import hu.java.dummy.db.DatabaseSessionProvider;
import org.hibernate.Session;

public abstract class AbstractRepository {
    protected Session getSession(){
        return DatabaseSessionProvider.getInstance().getSessionObj();
    }
}
