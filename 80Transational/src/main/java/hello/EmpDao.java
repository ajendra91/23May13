package hello;

import org.springframework.data.repository.CrudRepository;

public interface EmpDao extends CrudRepository<Emp, Integer> {

}
