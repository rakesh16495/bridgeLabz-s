#!/bin/bash

echo "Enter the No"
read num

fact=1

while [ $num -gt 1 ]
do
	fact=$((fact*num))
	((num --))
done

echo $fact