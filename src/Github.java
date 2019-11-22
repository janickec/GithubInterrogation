//Library used found here: http://github-api.kohsuke.org/
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

public class Github {
	
	GitHub github = new GitHubBuilder().withOAuthToken("1ee5881f8c5ed260253e61ecb4f0511f0e1a93e1").build();
	
	GitHub github2 = GitHub.connect();

	GHRepository repo = github.createRepository(
	  "new-repository","this is my new repository",
	  "",true/*public*/);
	repo.addCollaborators(github.getUser("janickec"));
	
	


	
}
