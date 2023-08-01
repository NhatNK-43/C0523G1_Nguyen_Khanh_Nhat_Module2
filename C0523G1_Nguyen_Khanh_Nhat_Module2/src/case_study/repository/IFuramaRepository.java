package case_study.repository;

import java.util.List;

public interface IFuramaRepository<T> {
    List<T> findAll();
    void add(T t);
    void edit(String id, List<T> tList,T t);
    void delete(String id,List<T> tList);
}
