#!/bin/bash

sum=0
sumofalldigit()
{	
        arr=("$@")
	for i in ${arr[@]}
	do	
		sum=$(($sum+$i))
	done
echo "$sum"
}

array=( 3 1 4 )
sumofalldigit "${array[@]}"