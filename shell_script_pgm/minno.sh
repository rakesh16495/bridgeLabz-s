#!/bin/bash

echo "Enter NO1"
read num1
echo "Enter NO2"
read num2
echo "Enter No3"
read num3

if [ $num1 -lt $num2 ] && [ $num1 -lt $num3 ]
then
	echo $num1

elif [ $num2 -lt $num1 ] && [ $num2 -lt $num3 ]
then
	echo $num2
else
	echo $num3
fi