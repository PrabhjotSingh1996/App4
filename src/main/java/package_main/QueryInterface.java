package package_main;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users",collectionResourceRel="users")
public interface QueryInterface extends PagingAndSortingRepository<User,Integer>{

	public User findByBalance(@Param("balance") String balance);
	
}