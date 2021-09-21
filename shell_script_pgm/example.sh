#!/bin/bash
echo "enter the no"
read no

for (( counter=$no; counter>0; counter-- ))
do
	echo "$counter"	
done
echo "\n"