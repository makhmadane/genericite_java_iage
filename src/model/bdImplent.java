package model;

import java.util.ArrayList;
import java.util.List;

public class bdImplent<T> {
    private List<T> personnes = new ArrayList<>();
    void add(T obj){
        personnes.add(obj);
    }
    void delete(T obj){
       personnes.remove(obj);
    }
    List<T> getAll(){
            return  personnes;
    }


}
