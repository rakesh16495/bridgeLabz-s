#!/bin/bash

head=0
tail=0

coin=$(($($RANDOM % 10 ) +1 ))
flips=1

while [ $flips -le 100 ]
do
	

	if [ $coin -eq 1 ]
	then
		echo "$head"
		head=$(($head+1))
	else
		echo "$tail"
		tail=$(($tail+1))
	
	fi

	flip=$(($flip+1))	
done


 echo "head = $head and tail = $tail"




