#!/bin/bash

declare -A dicto
arr=(1 2 3 4 5 6)
add=0
min=0
max=0

for(( i=0; i<6; i++ ))
do 
		read -p "Enter the no :" no
		if [ ${arr[$i]} -eq $no ]
		then
			
			echo "array value :${arr[$i]}"	
			dicto[value]=$i
		fi	 				
done

echo "**************Print Array**************************"
arrSize=${#arr[@]}

for((i=0; i<=$arrSize; i++))
do
	echo "${arr[$i]}"
done	
		
echo "*****************Print Dictionary******************"



for key in "${!dicto[@]}" 
do
	 echo "$key - ${dicto[$key]}"
done

