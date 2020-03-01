# Developer Notes

## Getting the code for the first time (clone local)

`git clone https://github.com/AlisonCasket/APCompSciA.git`

## Pushing changes

`git status`

`git commit -am "made changes"`

`git push`

## Pulling in changes from upstream

1. See if you have the upstream repo set up.

> `git remote -v`<br/>
> origin  https://github.com/AlisonCasket/APCompSciA.git (fetch)<br/>
> origin  https://github.com/AlisonCasket/APCompSciA.git (push)<br/>

2. Add the upstream repository, if not.

> `git remote add upstream https://github.com/hpluska/APCompSciA.git`

3. Verify that it is added.

> `git remote -v`<br/>
> origin  https://github.com/AlisonCasket/APCompSciA.git (fetch)<br/>
> origin  https://github.com/AlisonCasket/APCompSciA.git (push)<br/>
> upstream        https://github.com/hpluska/APCompSciA.git (fetch)<br/>
> upstream        https://github.com/hpluska/APCompSciA.git (push)<br/>

4. Get the contents from upstream.

> `git fetch upstream`

5. Make sure you are on your origin/master branch.

> `git checkout master`

6. Merge in the upstream changes to your local repo.

> `git merge upstream/master`

7. Fix any conflict, then commit/push.

## Build

Do the needful.