package com.parzival.userservice.Repository;

import com.parzival.userservice.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {
}
