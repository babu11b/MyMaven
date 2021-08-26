job("My_First_DSL"){
	scm{
	   git("https://github.com/babu11b/MyMaven.git", "*/master")
	}
	triggers{
	   scm('* * * * *')
	}
	steps{
	   maven{
	     mavenInstallation('MyMaven')
	     goals('clean')
             goals('install')	
	   }
        }
	publishers{
	   archiveArtifacts{
		pattern('**/*war')
	   }
	}
}
