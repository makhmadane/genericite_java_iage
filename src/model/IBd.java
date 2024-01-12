package model;

import java.util.List;

public interface IBd<T> {
    void add(T obj);
    void delete(T obj);
    List<T> getAll();


}
