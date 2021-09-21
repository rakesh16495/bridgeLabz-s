#!/bin/bash
echo "Enter the first Number"
read a
echo "Enter the secound Number"
read b
echo "Enter the third Number"
read c

var=3

while [ var >= 0 ]
do
	echo "First operation is a+b*c " $((a+b*c))
	echo "Secound operation is c+a/b" $((c+a/b))
	echo "Third operation is a%b+c " $((a%b+c))
	echo "Fourth operation is a*b+c" $((a*b+c))

       	((var++))
done