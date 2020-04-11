#!/bin/bash
if test -f "$1"; then
  if kotlinc -include-runtime -d a.jar "$1"; then
    java -jar a.jar
  else
      echo "compile failed"
      exit 1
  fi

else
  echo "$1 doesn't exist"
fi

