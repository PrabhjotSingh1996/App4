package package_main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMD_Runner implements CommandLineRunner{

	@Autowired
	private QueryInterface qi;
	
	@Override
	public void run(String... arg0) throws Exception {
		qi.save(new User(1,"A","10000"));
		qi.save(new User(2,"B","45331"));
		qi.save(new User(3,"C","42222"));
		qi.save(new User(4,"D","42222"));
		qi.findAll().forEach(t->System.out.println(t.getId()+"   "+t.getName()+"   "+t.getBalance()));
	}

}
