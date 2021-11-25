package in.aswinit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.aswinit.entity.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Serializable>{

}
