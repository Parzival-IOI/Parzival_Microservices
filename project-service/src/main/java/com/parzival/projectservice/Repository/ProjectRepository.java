package com.parzival.projectservice.Repository;

import com.parzival.projectservice.Model.ProjectModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectModel, String> {
}
