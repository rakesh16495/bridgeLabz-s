#!/bin/bash

arr=( [1]="Rakehsh" [2]="Mayur" [3]="Gotya")

if [ ${arr[2]+_} ]
then
		echo "found"
	else
		echo "Not found"
fi 