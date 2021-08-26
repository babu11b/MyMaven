job("My_First_DSL"){
	scm{
	   git("https://github.com/babu11b/MyMaven.git", "*/master")
	}
	triggers{
	   scm('* * * * *')
	}
	steps{
	   maven('clean install','pom.xml')
	}
	publishers{
	   archiveArtifacts{
		pattern('**/*war')
	   }
	}
}
