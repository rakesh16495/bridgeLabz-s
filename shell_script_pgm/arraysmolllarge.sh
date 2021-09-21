#!/bin/bash

arr=( 10 2 4 23 7)

biggest=${arr[0]}
smallest=${arr[0]}

for i in ${arr[@]}
do
	if [[ $i -gt $biggest ]]
	then
		biggest=$i
	fi

	if [[ $i -lt $smallest ]]
	then 
		smallest=$i
	fi

done

echo "The largest no is "$biggest

echo "The smallest no is "$smallest
