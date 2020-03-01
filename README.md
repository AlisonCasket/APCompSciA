# Developer Notes

## Getting the code for the first time (clone local)

`git clone https://github.com/AlisonCasket/APCompSciA.git`

## Pushing changes

`git status`
`git commit -am "made changes"`
`git push`

## Pulling in changes from upstream

* See if you have the upstream repo set up.
`git remote -v`
origin  https://github.com/AlisonCasket/APCompSciA.git (fetch)
origin  https://github.com/AlisonCasket/APCompSciA.git (push)

* Add the upstream repository, if not.
`git remote add upstream https://github.com/hpluska/APCompSciA.git`

* Verify that it is added.
`git remote -v`
origin  https://github.com/AlisonCasket/APCompSciA.git (fetch)
origin  https://github.com/AlisonCasket/APCompSciA.git (push)
upstream        https://github.com/hpluska/APCompSciA.git (fetch)
upstream        https://github.com/hpluska/APCompSciA.git (push)

* Get the contents from upstream.
`git fetch upstream`

* Make sure you are on your origin/master branch.
`git checkout master`

* Merge in the upstream changes to your local repo.
`git merge upstream/master`

* Fix any conflict, then commit/push.

## Build

Do the needful.