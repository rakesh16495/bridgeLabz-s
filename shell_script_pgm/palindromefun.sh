#!/bin/bash
palindromef ()
{
echo "Enter the No"
read no

temp=no
sum=0

while [ $temp > 0 ]
do
	rem= $(($temp%10))
	sum= $(($sum*10))+$rem
	temp= $(($temp/10)); 

	temp=$(($temp+1))
done

if [ temp == sum ]
then
	echo "No is palindrome "$temp
else
	echo "Not palindrome "$sum

fi

}

palindromef