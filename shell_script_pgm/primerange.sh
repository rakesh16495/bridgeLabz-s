#!/bin/bash

count=0

echo "Prime Number from given range:"

for((i=2; i<=10; i++))
do
     count=1
		
	for((j=2; j<i; j++))
	do
		if [ $((i%j)) -eq 0 ]
		then
			count=0
			break
		fi
	done

if [ $count -eq 1 ]
then
	echo "$i: prime no"
else
	echo "$i: not prime "	
fi

done	