## 常用Git命令

1. git init   

   初始化一个Git仓库，加上.git文件夹；

2. git add \<file>

   添加文件到git仓库，可以反复使用，加多个文件

   （该命令是将工作区的内容提交到**暂存区Stage**中）

3. git commit -m \<message>

   一次提交多个修改的文件，后面message信息自己写；

   （一次性将暂存区的所有内容提交到**当前分支**，如：master分支）

4. git status

   显示工作区的状态，哪些文件被修改过，没有提交

5. git diff

   显示具体修改的内容；

   git diff \<filename>  查看**工作区与暂存区**内该文件的差异；

6. git diff HEAD -- \<file>

   查看**工作区和版本库最新版本的该文件**的区别；

7. git reset --hard [commit_id]

   **回退到指定版本**，其中HEAD表示当前版本，HEAD^表示上一版本，HEAD~100表示前100版本。也可以直接输入版本号的前几位就行了。示例：git reset --hard b1fe  （输入版本号前几位）

8. git log

   查看提交的历史，方便回退到指定版本；

9. git reflog

   记录每一次的提交、回退命令。方便从过去版本回到未来的版本；

10. git checkout -- \<file>...

    用于**撤销文件在工作区的修改**，

    文件修改了，还没提交到暂存区，撤销修改回到版本库一样的状态；

    文件提交到暂存区后，又修改了，撤销到文件添加到暂存区后的整体；

    总之，只撤销当前做的改动。示例：git checkout -- readme.txt   #撤销readme.txt文件最近的修改

11. git reset HEAD \<file>

    **将提交到暂存区中的修改撤销掉**，即修改过的文件提交到暂存区中后，用该命令撤销修改；

12. git rm \<file>

    从版本库中删除指定的文件，注意该命令和git add一样都需要git commit提交。

    如果是工作区中误删除文件，使用git checkout -- \<file>恢复，##该命令的作用就是用版本库中的版本替换工作区中的版本，无论是添加还是删除。

14. git push origin master

    #origin是添加的远程仓库名，命令功能将master分支推送到远程仓库中；

15. git remote add origin git@server-name:path/repo-name.git

    **关联一个远程仓库**

16. git push -u origin master

    第一次推送master分支的所有内容到远程库中；

17. git clone git@server-name:path/repo-name.git

    将远程库中的资源拷贝到本地，示例：

    ```shell
    git clone git@github.com:longbig/repo.git
    git clone https://github.com/longbig/repo.git   #两句功能一样，https需要输入账号和密码
    ```



## 分支管理

18. git branch

    查看分支；

19. git branch \<name>

    创建一个名为name的分支；

20. git checkout \<name>

    切换到 name分支；ds

21. git checkout -b \<name>

    创建并切换到新分支；

22. git merge \<name>

    合并 name 分支到当前分支；

23. git branch -d \<name>

    删除分支；

24. **删除远程分支**

    git branch -r -d origin/branch-name
    git push origin :branch-name

25. git log --graph

    可以查看分支的合并情况，分支合并时对相同文件的修改会冲突，需要手动修改冲突的地方。

    git status可以查看冲突的位置；

26. git log --graph --pretty=oneline -- abbrev-commit

    简洁地显示分支合并情况；

27. git merge --no-ff -m "merge without no-ff" dev

    参数`--no-f`表示禁用`Fast forward`模式合并，这样合并之后有的历史有分支。而`Fast forward`合并就看不出来做过合并； -m 表示commit时直接写好了备注；

28. git stash

    **存储当前的工作现场**，注意先要git add，然后可以创建新的分支进行其他工作（如：**修复bug用到**）。修复完之后可以`git stash pop`回到当前工作现场；

29. git stash list

    查看已经保存的工作现场，可以有多个；

30. git stash apply [stash@{N}]

    恢复最近保存的工作现场，但是恢复后stash保存的内容不会删除；

    后面加上参数`stash@{N}`其中N表示list列出后的序列号，表示恢复指定序号N的工作现场；

31. git stash drop

    删除stash保存的内容；

32. git branch -D \<name>

    强行删除一个分支，当前分支的工作都将丢失。**开发一个新feature，需要创建一个新分支**；

33. git branch --set-upstream-to=origin/dev dev

    **建立本地dev分支与远程origin/dev分支的链接**，git pull 从远程仓库拉取失败时会提示的；

34. git pull

    建立链接之后，从远程仓库拉取分支

35. git remote [-v]

    查看远程库信息

36. **git checkout -b branch-name origin/branch-name**

    **基于远程分支创建本地分支；**

37. git rebase

    把本地未push的分叉提交历史整理成直线；（前提条件：,前面至少要有一个人先提交同一个文件,造成此时要操作的本地git库与远程不符,再在本地git进行提交操作。注意：git rebase知识返回冲突出现的提交处的commit，还需要解决冲突之后再 git rebase --continu）；

## 标签管理

37. git tag \<name>

    给当前分支打上标签，示例：`git tag v1.0` #给master分支打上v1.0的标签；

38. git tag

    查看所有标签；

39. git show \<tagname>

    查看该标签的信息；

40. git tag -a \<tagname> -m "message" [commit_id]

    为指定的commit创建带有信息的标签；

41. git push origin \<tagname>

    将一个本地标签推送到远程；

42. git push origin --tags

    将全部未推送的标签推送到远程；

43. git tag -d \<tagname>

    删除一个本地标签；

44. git push origin :refs/tags/\<tagname>

    删除指定的远程标签；

### .gitignore文件

该文件中可以定义要忽略的特殊文件，具体参考：https://github.com/github/gitignore

### 别名

45. git config --global alias.[别名] [真名]

    示例：`git config --global alias.st status`全局设置st = status，这样以后可以使用st表示status

    全局设置文件在.git/config 中，打开设置alias



**回退版本**

git reset 只能回退本地仓库的版本，远程不行；

git revert  用一个新提交来消除一个历史提交所做的任何修改，可以回退远程仓库的版本；

使用： git revert [commit_id前几位]

**比较分支文件差异**

git diff branch1 branch2    //显示所有有差异的文件详细差异

git diff branch1 branch2 文件名(带路径)   //显示指定文件的差异

git diff branch1 branch2 --stat   //显示所有差异文件的列表

**比较本地仓库与远程仓库的差异**

```
git fetch origin   //更新本地的远程分支
git log master..origin/master   //本地与远程的差集

# git diff <local branch> <remote>/<remote branch>  //统计文件的改动，两句都是
git diff --stat master origin/master
```

**打标签的意义**

commit_id太长了，用tag标签来记录，以便回退到此版本。通常打版本号

**拉取远程分支到本地**

```ba
//把远程分支拉到本地
git fetch orgin dev(dev为远程仓库的分支名)

//在本地创建dev分支，并切换到该分支
git checkout -b dev(本地分支名) origin/dev(远程分支名)

//把远程分支的内容拉取到本地,先要切换到该分支
git pull origin dev(远程分支名)
```



