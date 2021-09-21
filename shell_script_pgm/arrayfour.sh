#!/bin/bash

arr=(Rakesh Ovi 123 tilak 786)

echo ${arr[@]}  #Rakesh Ovi 123 tilak 786

echo ${arr[*]} #Rakesh Ovi 123 tilak 786

echo ${arr[@]:1} #Ovi 123 tilak 786

echo ${arr[*]:3}  #tilak 786

echo ${arr[0]}  #Rakesh

echo ${arr} #Rakesh

echo ${arr[1]} #Ovi

echo ${arr[@]:2:5} #123 tilak 786

echo ${arr[1]:2} # i

echo ${#arr}  #lenght of array

echo ${#arr[3]} #particular index position length

echo ${arr[@]/*[t]*/} #Rakesh Ovi 123 786

echo ${arr[*]//v/TT} #replacing letter

echo ${arr[3]//l//LL} #replacing indexed base letterf