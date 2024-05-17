package com.parzival.projectservice.Model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Projects")
@Builder
@Data
public class ProjectModel {
    @Transient
    public static final String SEQUENCE_NAME = "projects_sequence";
    @Id
    private String id;
    private String title;
    private String language;
    private String description;
    private String link;
    private String image;
}
