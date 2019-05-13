package hello;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	public EmpDao ed;
	
	@RequestMapping("/emp")
	public List<Emp> getAll(){
		return (List<Emp>) ed.findAll();
	}
	
	@RequestMapping("/save")
	@Transactional
	public void add() {
		
		Emp emp = new Emp(1,"ajay55","100055");
		ed.save(emp);
		int i=Integer.parseInt("");
		
	}
	
}
