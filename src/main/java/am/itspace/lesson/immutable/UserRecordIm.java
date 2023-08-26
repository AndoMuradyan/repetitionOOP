package am.itspace.lesson.immutable;

import java.util.Date;

record UserRecordIm(String name, Date date) {

    UserRecordIm(String name, Date date) {
        this.name = name;
        this.date = (Date) date.clone();
    }

//    anrajesht e unenal set bayc chxaxtel immutable utyuny
    public UserRecordIm setName(String name){
        return new UserRecordIm(name,this.date());
    }
    @Override
    public Date date() {
        return (Date) date.clone();
    }
}
