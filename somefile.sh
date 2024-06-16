#!/bin/bash

if [ "develop" == "master" ] || [ "develop" == "develop" ] ; then
  echo "BLACK_DUCK_PROJECT_VERSION=CSDataCore-master_docker" >> $GITHUB_ENV
else
  echo "BLACK_DUCK_PROJECT_VERSION=CSDataCore-feature_docker" >> $GITHUB_ENV
fi

echo $GITHUB_ENV