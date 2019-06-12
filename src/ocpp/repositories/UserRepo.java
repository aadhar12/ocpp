package ocpp.repositories;

import	org.springframework.data.jpa.repository.JpaRepository;
import ocpp.entity.User;

public interface UserRepo extends JpaRepository<User,Long>{
	
}