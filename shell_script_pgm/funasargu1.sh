#!/bin/bash

echo "Taking array as arguments"

userInput_array()
{
	arr=("$@")
	
	for i in "${arr[@]}"
	do
		echo "$i"
	done
}

array=("Rakesh 1" "Nikita 2" "Govinda 3")

userInput_array "${array[@]}"


