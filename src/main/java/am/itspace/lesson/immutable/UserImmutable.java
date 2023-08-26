package am.itspace.lesson.immutable;

import java.util.Date;

public final class UserImmutable {

    private final String name;
    private final Date bd;

    UserImmutable(String name, Date bd) {
        this.name = name;
        this.bd = (Date) bd.clone();
    }

    public String getName() {
        return name;
    }

    public Date getBd() {
        return (Date) bd.clone();
    }
}
