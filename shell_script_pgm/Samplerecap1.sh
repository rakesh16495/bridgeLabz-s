#!/bin/bash

read -p "Enter the first num:" num1
read -p "Enter the secound num:" num2

sum=0
mul=0
div=0	
echo "Enter the choice"
echo "1.Addition"
echo "2.multiplication"
echo "3.division" 
read ch

case &ch in 

	1)sum=$(($num1+$num2))
	  echo "Addition of:"$sum

	2)mul=$(($num1*$num2))		
	  echo "Multiplication of:"$mul

	3)div=$(($num1/$num2))
	  echo "Division of:"$div
esac	