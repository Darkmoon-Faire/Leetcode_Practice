# Leetcode_Practice
> - Enjoy life, enjoy coding.
>
> - Here is The Darkmoon-Faire Leetcode programing playground, you can enjoy coding by soluting problems on Leetcode, and make a record in this repository.

------



#### You can start your programming journey by the following instructions.

#### If you have not config your git accounts,you can follown the following tutorial to config your git accounts.

[About git configurations]( https://www.yawujia.cn/2017/10/11/github-study/ )

------

### Steps to start your journey.

------



1. ##### clone current repository

   `git  clone  git@github.com:Darkmoon-Faire/Leetcode_Practice.git` 

2. ##### make your own working directory

   `cd Leetcode_Practice`

   `mkdir your nickname`

   Besides,  if you want to diff from other members with branch, you can make your own branch by the following commands.

   `git checkout  -b your_nickname`

   then write some doc,code etc .

   after finish coding or writing , you can use the following  commands to push your changes.

   `git add .`

   `git commit  -m  "add new solutions | update some code"`

   `git push origin your_nickname`

   you can also merge your branch to the master branch by using the following commands.

   `git checkout master`    // switch to the master branch

   `git merge your_branch`  // merge your own branch to the master

   `git push origin master`       // publish your own branch to the remote master branch

3. #####  About the merge conflicts

   Before writing something , you can use the following commands to fetch the remote changes to your local branch,this is recommend to keep your local branch update to the remote.

   `git pull origin your_branch`  or    `git pull origin master`  // this will update the remote changes to your local.

   when you meeet merge conflicts, you can solve the merge conflicts by the following operations.

   1. edit the conflicting conflicting files.
   2. commit your changes by    `git commit -m "fix some merge conflicts"`
   3. publish your branch to the remote by `git push origin master | your_own_branch | target branch`

4. ##### Stash your local changes and not commit them

    git allows you to storage your local changes and not commit them,when you have something to do and you are not willed to commit to your local branch,you can follow the following commands.

   | `git stash`       | storage your local changes                        |
   | ----------------- | ------------------------------------------------- |
   | `git stash pop`   | recover your local changes to your current branch |
   | `git stash clear` | remove all the stash                              |

   References:   [git stash]( https://git-scm.com/docs/git-stash )

   ------

   

   ## Now，you can start your leetcode solving problem journey, have fun!

   

   

   

   

   

   

   