#!/bin/bash

echo "Enter the first No"
read a
echo "Enter the secound no"
read b

echo "Enter Choice:"
echo "1.Addition"
echo "2.Subtraction"
echo "3.Multiplication"
echo "4.Division"
read ch

case $ch in
	1)result=$(($a+$b));;
	2)result=$(($a-$b));;
	3)result=$(($a*$b));;
	4)result=$(($a/$b));;

esac

echo "Result:"$result