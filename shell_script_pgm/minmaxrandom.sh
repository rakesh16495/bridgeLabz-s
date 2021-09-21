#!/bin/bash
#Write a program that reads 5 Random 3 Digit values and then outputs the minimum and the maximum value
max=0
min=0

for((i=0; i<=5; i++))
do
	a=$((RANDOM%1000))
	
	if [ $a -gt 100 ] 
	then
		
		max="$a"
	fi

	if [ $a -lt 100 ]
	then
		min="$a"
	fi
done

echo "The largest RANDOM number is $max"
echo "The smallest RAMDOM number is $min"