job("My_First_DSL"){
	scm{
		git("https://github.com/babu11b/MyMaven.git",master)
	}
	triggers{
	   scm('* * * * *')
	}
	steps{
	   maven('clean install')
	}
	publishers{
		archiveArtifacts{
			pattern('**/*war')
		}
	}
}
