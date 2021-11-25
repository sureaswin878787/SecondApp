package in.aswinit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.aswinit.entity.UserEntity;
import in.aswinit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=(AnnotationConfigApplicationContext)SpringApplication.run(Application.class, args);
		System.out.println(context.getClass());
		UserRepository repository=context.getBean(UserRepository.class);
		//single record
		/*
		UserEntity entity=new UserEntity();
		entity.setUserId(5);
		entity.setUserName("eee");
		entity.setUserEmail("eee@gmail.com");
		entity.setUserAge(25);
		repository.save(entity);*/
		
		
		//group of records
		
		UserEntity entity1=new UserEntity();
		entity1.setUserId(11);
		entity1.setUserName("abc");
		entity1.setUserEmail("abc@gmail.com");
		entity1.setUserAge(23);
		UserEntity entity2=new UserEntity();
		entity2.setUserId(12);
		entity2.setUserName("def");
		entity2.setUserEmail("def@gmail.com");
		entity2.setUserAge(13);
		UserEntity entity3=new UserEntity();
		entity3.setUserId(13);
		entity3.setUserName("ijk");
		entity3.setUserEmail("ijk@gmail.com");
		entity3.setUserAge(23);
		List<UserEntity> entities=new ArrayList<UserEntity>();
		entities.add(entity1);entities.add(entity2);entities.add(entity3);
		repository.saveAll(entities);
		
		
		//display all records
		//added toString() method in UserEntity class
		/*
		Iterable<UserEntity> findAll=repository.findAll();
		findAll.forEach(u->System.out.println(u));
		*/
		
		//display single record
		/*
		Optional<UserEntity> findById=repository.findById(11);
		if(findById.isPresent())
		{
			UserEntity entity=(UserEntity)findById.get();
			System.out.println(entity);
		}*/
		
		//display specific records
		/*
		Iterable<Serializable> userIds=Arrays.asList(11,13);
		Iterable<UserEntity> entities=repository.findAllById(userIds);
		entities.forEach(u->System.out.println(u));
		*/
		
		//delete single record
		//repository.deleteById(11);
		
		//delete specific records
		/*
		Iterable<Serializable> userIds=Arrays.asList(12,13);
		repository.deleteAllById(userIds);
		*/
		
		//delete all records
		//repository.deleteAll();
		
	}
}
















