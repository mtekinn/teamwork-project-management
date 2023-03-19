package com.example.teamwork;

import com.example.teamwork.model.Project;
import com.example.teamwork.reposity.ProjectRepository;
import com.example.teamwork.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProjectServiceTest {

    @InjectMocks
    private ProjectService projectService;

    @Mock
    private ProjectRepository projectRepository;

    @Test
    void shouldCreateProject() {
        Project project = new Project("Test Project", "A test project");
        projectService.createProject(project);
        verify(projectRepository).save(project);
    }
}
