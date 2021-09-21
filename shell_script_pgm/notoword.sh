#!/bin/bash

echo "Enter No:"
read n

len=$n; 

echo "Your no $n in words"

for(( i=1; i<=$len-1; i++ ))
do
   digit=$(echo $n | cut -c $i)  #no read to index possition wise

  case $digit in 
 
    0) echo "Zero" ;;
    1) echo "One"  ;;
    2) echo "Two"  ;;
    3) echo "Three";;
    4) echo "Four" ;;
    5) echo "Five" ;; 
    6) echo "Six"  ;;
    7) echo "Seven" ;;
    8) echo "Eight" ;;
    9) echo "Nine" ;;

  esac

done

