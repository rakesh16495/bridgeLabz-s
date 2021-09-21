#!/bin/bash

sum=0
mul=0
div=0

echo "Enter the size" 
read size
count=0
declare -a calarray
declare -A dict

i=0
while [ $i -lt $size ]
do

  read -p "Enter the first num:" num1
  read -p "Enter the secound num:" num2
	
		if [ $num1 -gt 10 ] && [ $num2 -gt 10 ]
	        then
			  sum=$(($num1+$num2))
      	  		  echo "Addition of:"$sum 
			  calarray[$count]=$sum
                          dict[sumvalue]=$sum
			  echo $count	
			  echo "Array value is:"${calarray[@]}		 	
			  			
		
		elif [ $num1 -lt 10 ] && [ $num2 -lt 10 ]
		then
			  mul=$(($num1*$num2))		
	        	  echo "Multiplication of:"$mul 
			  calarray[$count]=$mul
			  dict[mulvalue]=$mul	
			  echo "Array mul value is:"${calarray[@]}			
		else
        		  div=$(($num1/$num2))
	        	  echo "Division of:"$div
			  calarray[$count]=$div
			  dict[divvalue]=$div 	
			  echo "Array div value is:"${calarray[@]}		 
		fi
	
	
  i=$(($i+1))
  count=$(($count+1))
 
done


echo "*****************Array Printed*********************"


var=${#calarray[@]}
for((i=0; i<$var; i++))
do		 
	echo "${calarray[@]}"

done

echo"******************Dictionary Printed************************"


for key in "${!dict[@]}"
do
	echo "$key - ${dict[$key]}"
done