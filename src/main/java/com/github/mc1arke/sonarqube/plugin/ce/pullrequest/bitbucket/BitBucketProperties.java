package com.github.mc1arke.sonarqube.plugin.ce.pullrequest.bitbucket;

import java.util.List;

import org.sonar.api.PropertyType;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.config.PropertyDefinition.ConfigScope;

public abstract class BitBucketProperties {

	private BitBucketProperties() {
		// static methods only
	}
	
	public static List<PropertyDefinition> getProperties() {
		return List.of(
	                PropertyDefinition
		                .builder(BitbucketPullRequestDecorator.PUBLISH_BUILD_STATUS)
		                .name("Publish BitBucket Build Status")
		                .description("Publish the SonarQube analysis result as a Build Status to the BitBucket pull request. "
		              		  + "This may block the merging of the Pull Request, depending on the merge rules that "
		              		  + "are configured for the repository.")
		                .category("Pull Request Decoration")
		                .onConfigScopes(ConfigScope.PROJECT)
		                .type(PropertyType.BOOLEAN)
		                .defaultValue("true")
		                .build()
				);
	}
	
}
