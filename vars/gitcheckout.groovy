
#!/usr/bin/env groovy
 
defcall(branch, url) 
{​​​​​​​​
def branchName = branch
def urllink = url
 
checkout([
$class: 'GitSCM', 
branches: [[name:"$branchName" ]], 
extensions: [[$class:'WipeWorkspace']],
userRemoteConfigs: [[url: "$urllink" ]]
])
 
}

