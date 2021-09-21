#!bin/bash

declare -A dict
dict=( ['a']=1 ['b']=2 ['c']=3 )

for item in "${!dict[@]}"
do
	dict+=( ['R']=5)
	echo "$item - ${dict[$item]}"
	
done

echo "Size of dictionary:${#dict[@]}"  #size of the given dictionary

