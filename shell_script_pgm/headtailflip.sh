#!/bin/bash

head=0
tails=0

flips=1

while [ $flips < 100 ]
do
	if [ $((random.randint( 1,2 ))) -eq 1 ]
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




