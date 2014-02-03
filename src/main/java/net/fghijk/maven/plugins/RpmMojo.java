package net.fghijk.maven.plugins;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "package", defaultPhase = LifecyclePhase.PACKAGE)
public class RpmMojo extends AbstractMojo {
	@Component
	private MavenProject project;

	@Parameter(required = true)
	private File outputRpm;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		project.getArtifact().setFile(outputRpm);
	}
}