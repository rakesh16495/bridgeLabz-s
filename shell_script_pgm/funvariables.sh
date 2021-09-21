#!/bin/bash

var1='A'
var2='B'

fun_variable()
{
	local var1=Rakesh
	var2=200
	
	echo "Inside function: var1:$var1,var2:$var2"
}

	echo "Before executing function:var1:$var1,var2:$var2"	

fun_variable

	echo "After calling function: var1:$var1,var2:$var2"