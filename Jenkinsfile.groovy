job("My_First_DSL"){
	scm{
	   git("https://github.com/babu11b/MyMaven.git", "*/master")
	}
	triggers{
	   scm('* * * * *')
	}
	steps{
           maven('clean package', 'pom.xml')
        }
	publishers{
	   archiveArtifacts{
		pattern('**/*war')
	   }
	}
}
