#!bin/bash

arr=( "Rakesh" 1 "Ovi" 3)

echo "Array element is : "
echo "${arr[@]}"


temp="${#arr[@]}"

for (( i=0; i<=$temp; i++ ))
do
	
	unset 'arr[0]'

done

echo "After deleting Array is:"

echo "${arr[@]}"
