#!/bin/bash

echo "Enter the No"
read no

for(( i=2; i<=$no/2; i++ ))
do
	if [ $((no%i)) -eq 0 ]
	then
		echo "$no is not prime number."
	fi
done

echo "$no is  prime number"