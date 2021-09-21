#!/bin/bash

read -p "Enter Month:"month
read -p "Enter Date: "date


if [ $month -gt 3 ] && [ $month -gt 6 ] && [ $date -gt 31 ]
then
	echo $month $date "true"
else
	echo "False"

fi